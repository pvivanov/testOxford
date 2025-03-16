import org.example.entities.Response;
import org.example.gateway.OxfordDictionariesTranslateGateway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class OxfordDictionariesTranslateTests {

    @ParameterizedTest
    @ValueSource(strings = { "age" })
    @DisplayName("Text translation with API Oxford translator")
    public void translateTextAge(String textToTranslate) {
        OxfordDictionariesTranslateGateway translateGateway = new OxfordDictionariesTranslateGateway();
        Response translateTextResponse = translateGateway.getTranslateText(textToTranslate);
        Assertions.assertEquals("во́зраст", translateTextResponse.results().getFirst().lexicalEntries().getFirst().entries().getFirst().senses().getFirst().translations().getFirst().text());
    }
}
