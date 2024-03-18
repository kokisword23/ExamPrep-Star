package softuni.exam.models.dto.xmls;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "astronomers")
@XmlAccessorType(XmlAccessType.FIELD)
public class AstronomerRootDto implements Serializable {

    @XmlElement(name = "astronomer")
    private List<AstronomerSeedDto> astronomerSeedDtos;

    public List<AstronomerSeedDto> getAstronomerSeedDtos() {
        return astronomerSeedDtos;
    }

    public void setAstronomerSeedDtos(List<AstronomerSeedDto> astronomerSeedDtos) {
        this.astronomerSeedDtos = astronomerSeedDtos;
    }
}
