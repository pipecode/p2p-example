package co.pipecode.p2p.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import co.pipecode.p2p.client.PSEClient;
import co.pipecode.p2p.client.entities.Authentication;
import co.pipecode.p2p.client.util.P2PUtils;

@Configuration
public class PSEConfiguration {

	@Value("${co.pipecode.p2p.keys.tranKey}")
	private String tranKey;

	@Value("${co.pipecode.p2p.keys.login}")
	private String login;
	
	@Value("${co.pipecode.p2p.keys.wsdlUrl}")
	private String wsdlUrl;

	@Bean
	public Authentication autentication() {
		Authentication auth = new Authentication();
		auth.setLogin(this.login);
		auth.setSeed(P2PUtils.getSeed());
		auth.setTranKey(P2PUtils.getSHA1(P2PUtils.getSeed() + this.tranKey));
		return auth;
	}

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("co.pipecode.p2p.client.entities");
		return marshaller;
	}

	@Bean
	public PSEClient pseClient(Jaxb2Marshaller marshaller) {
		PSEClient client = new PSEClient(autentication());
		client.setDefaultUri(this.wsdlUrl);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
