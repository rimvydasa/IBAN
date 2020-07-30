package lt.alminas.test;

import lt.alminas.model.Card;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    private Card card = new Card();
    private boolean expectedFalse = false;
    private boolean expectedTrue = true;

    @Test
    public void testIbanNumberCheckTrue() {
        assertEquals(expectedTrue,card.ibanNumberCheck("LT647044001231465456"));
        assertEquals(expectedTrue,card.ibanNumberCheck("LT647044001231465456"));
        assertEquals(expectedTrue,card.ibanNumberCheck("AL35202111090000000001234567"));
        assertEquals(expectedTrue,card.ibanNumberCheck("AD1400080001001234567890"));
        assertEquals(expectedTrue,card.ibanNumberCheck("AT483200000012345864"));
        assertEquals(expectedTrue,card.ibanNumberCheck("AZ96AZEJ00000000001234567890"));
        assertEquals(expectedTrue,card.ibanNumberCheck("BH02CITI00001077181611"));
        assertEquals(expectedTrue,card.ibanNumberCheck("BY86AKBB10100000002966000000"));
        assertEquals(expectedTrue,card.ibanNumberCheck("BE71096123456769"));
        assertEquals(expectedTrue,card.ibanNumberCheck("BA393385804800211234"));
    }

    @Test
    public void testIbanNumberCheck1() {
        assertEquals(expectedTrue,card.ibanNumberCheck("BR1500000000000010932840814P2"));
        assertEquals(expectedTrue,card.ibanNumberCheck("BG18RZBB91550123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CR23015108410026012345"));
        assertEquals(expectedTrue,card.ibanNumberCheck("HR1723600001101234565"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CY21002001950000357001234567"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CZ5508000000001234567899"));
        assertEquals(expectedTrue,card.ibanNumberCheck("DK9520000123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("DO22ACAU00000000000123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("EG800002000156789012345180002"));
        assertEquals(expectedTrue,card.ibanNumberCheck("SV43ACAT00000000000000123123"));
    }

    @Test
    public void testIbanNumberCheck2() {
        assertEquals(expectedTrue,card.ibanNumberCheck("EE471000001020145685"));
        assertEquals(expectedTrue,card.ibanNumberCheck("FO9264600123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("FI1410093000123458"));
        assertEquals(expectedTrue,card.ibanNumberCheck("FR7630006000011234567890189"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GE60NB0000000123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("DE75512108001245126199"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GI04BARC000001234567890"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GR9608100010000001234567890"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GL8964710123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GT20AGRO00000000001234567890"));
    }

    @Test
    public void testIbanNumberCheck3() {
        assertEquals(expectedTrue,card.ibanNumberCheck("VA59001123000012345678"));
        assertEquals(expectedTrue,card.ibanNumberCheck("HU93116000060000000012345676"));
        assertEquals(expectedTrue,card.ibanNumberCheck("IS750001121234563108962099"));
        assertEquals(expectedTrue,card.ibanNumberCheck("IQ20CBIQ861800101010500"));
        assertEquals(expectedTrue,card.ibanNumberCheck("IE64IRCE92050112345678"));
        assertEquals(expectedTrue,card.ibanNumberCheck("IL170108000000012612345"));
        assertEquals(expectedTrue,card.ibanNumberCheck("IT60X0542811101000000123456"));
        assertEquals(expectedTrue,card.ibanNumberCheck("JO71CBJO0000000000001234567890"));
        assertEquals(expectedTrue,card.ibanNumberCheck("KZ563190000012344567"));
        assertEquals(expectedTrue,card.ibanNumberCheck("XK051212012345678906"));
    }

    @Test
    public void testIbanNumberCheck4() {
        assertEquals(expectedTrue,card.ibanNumberCheck("KW81CBKU0000000000001234560101"));
        assertEquals(expectedTrue,card.ibanNumberCheck("LV97HABA0012345678910"));
        assertEquals(expectedTrue,card.ibanNumberCheck("LB92000700000000123123456123"));
        assertEquals(expectedTrue,card.ibanNumberCheck("LI7408806123456789012"));
        assertEquals(expectedTrue,card.ibanNumberCheck("LT601010012345678901"));
        assertEquals(expectedTrue,card.ibanNumberCheck("LU120010001234567891"));
        assertEquals(expectedTrue,card.ibanNumberCheck("MT31MALT01100000000000000000123"));
        assertEquals(expectedTrue,card.ibanNumberCheck("MR1300020001010000123456753"));
        assertEquals(expectedTrue,card.ibanNumberCheck("MU43BOMM0101123456789101000MUR"));
        assertEquals(expectedTrue,card.ibanNumberCheck("MD21EX000000000001234567"));
    }

    @Test
    public void testIbanNumberCheck5() {
        assertEquals(expectedTrue,card.ibanNumberCheck("MC5810096180790123456789085"));
        assertEquals(expectedTrue,card.ibanNumberCheck("ME25505000012345678951"));
        assertEquals(expectedTrue,card.ibanNumberCheck("NL02ABNA0123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("MK07200002785123453"));
        assertEquals(expectedTrue,card.ibanNumberCheck("NO8330001234567"));
        assertEquals(expectedTrue,card.ibanNumberCheck("PK36SCBL0000001123456702"));
        assertEquals(expectedTrue,card.ibanNumberCheck("PS92PALS000000000400123456702"));
        assertEquals(expectedTrue,card.ibanNumberCheck("PL10105000997603123456789123"));
        assertEquals(expectedTrue,card.ibanNumberCheck("PT50002700000001234567833"));
        assertEquals(expectedTrue,card.ibanNumberCheck("QA54QNBA000000000000693123456"));
    }

    @Test
    public void testIbanNumberCheck6() {
        assertEquals(expectedTrue,card.ibanNumberCheck("RO09BCYP0000001234567890"));
        assertEquals(expectedTrue,card.ibanNumberCheck("LC14BOSL123456789012345678901234"));
        assertEquals(expectedTrue,card.ibanNumberCheck("SM76P0854009812123456789123"));
        assertEquals(expectedTrue,card.ibanNumberCheck("ST23000200000289355710148"));
        assertEquals(expectedTrue,card.ibanNumberCheck("SA4420000001234567891234"));
        assertEquals(expectedTrue,card.ibanNumberCheck("RS35105008123123123173"));
        assertEquals(expectedTrue,card.ibanNumberCheck("SC52BAHL01031234567890123456USD"));
        assertEquals(expectedTrue,card.ibanNumberCheck("SK8975000000000012345671"));
        assertEquals(expectedTrue,card.ibanNumberCheck("SI56192001234567892"));
        assertEquals(expectedTrue,card.ibanNumberCheck("ES7921000813610123456789"));
    }

    @Test
    public void testIbanNumberCheck7() {
        assertEquals(expectedTrue,card.ibanNumberCheck("SE7280000810340009783242"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CH5604835012345678009"));
        assertEquals(expectedTrue,card.ibanNumberCheck("TL380010012345678910106"));
        assertEquals(expectedTrue,card.ibanNumberCheck("TN5904018104004942712345"));
        assertEquals(expectedTrue,card.ibanNumberCheck("TR320010009999901234567890"));
        assertEquals(expectedTrue,card.ibanNumberCheck("UA903052992990004149123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("AE460090000000123456789"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GB33BUKB20201555555555"));
        assertEquals(expectedTrue,card.ibanNumberCheck("VG21PACG0000000123456789"));
    }

    @Test
    public void testIbanNumberCheckFalse() {
        assertEquals(expectedFalse,card.ibanNumberCheck("AA051245445454552117989"));
        assertEquals(expectedFalse,card.ibanNumberCheck("LT227044077788877777"));
        assertEquals(expectedFalse,card.ibanNumberCheck("CC051245445454552117989"));
    }

    @Test
    public void testIbanNumberCheck8() {
        assertNotEquals(expectedTrue,card.ibanNumberCheck("AA051245445454552117989"));
        assertNotEquals(expectedTrue,card.ibanNumberCheck("LT227044077788877777"));
        assertNotEquals(expectedTrue,card.ibanNumberCheck("CC051245445454552117989"));
    }

    @Test
    public void testIbanNumberCheck9() {
        assertNotEquals(expectedFalse,card.ibanNumberCheck("SE7280000810340009783242"));
        assertNotEquals(expectedFalse,card.ibanNumberCheck("CH5604835012345678009"));
        assertNotEquals(expectedFalse,card.ibanNumberCheck("TL380010012345678910106"));
        assertNotEquals(expectedFalse,card.ibanNumberCheck("TN5904018104004942712345"));
        assertNotEquals(expectedFalse,card.ibanNumberCheck("TR320010009999901234567890"));
        assertNotEquals(expectedFalse,card.ibanNumberCheck("UA903052992990004149123456789"));
        assertNotEquals(expectedFalse,card.ibanNumberCheck("AE460090000000123456789"));
        assertNotEquals(expectedFalse,card.ibanNumberCheck("GB33BUKB20201555555555"));
        assertNotEquals(expectedFalse,card.ibanNumberCheck("VG21PACG0000000123456789"));
    }

    @Test
    public void testIbanNumberCheck10() {
        assertEquals(expectedTrue,card.ibanNumberCheck("DZ580002100001113000000570"));
        assertEquals(expectedTrue,card.ibanNumberCheck("AO06004400006729503010102"));
        assertEquals(expectedTrue,card.ibanNumberCheck("BJ66BJ0610100100144390000769"));
        assertEquals(expectedTrue,card.ibanNumberCheck("BF42BF0840101300463574000390"));
        assertEquals(expectedTrue,card.ibanNumberCheck("BI43201011067444"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CM2110002000300277976315008"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CV64000500000020108215144"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CF4220001000010120069700160"));
        assertEquals(expectedTrue,card.ibanNumberCheck("TD8960002000010271091600153"));
    }

    @Test
    public void testIbanNumberCheck11() {
        assertEquals(expectedTrue,card.ibanNumberCheck("KM4600005000010010904400137"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CG3930011000101013451300019"));
        assertEquals(expectedTrue,card.ibanNumberCheck("DJ2110002010010409943020008"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GQ7050002001003715228190196"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GA2140021010032001890020126"));
        assertEquals(expectedTrue,card.ibanNumberCheck("GW04GW1430010181800637601"));
        assertEquals(expectedTrue,card.ibanNumberCheck("HN54PISA00000000000000123124"));
        assertEquals(expectedTrue,card.ibanNumberCheck("IR710570029971601460641001"));
        assertEquals(expectedTrue,card.ibanNumberCheck("CI93CI0080111301134291200589"));
    }

    @Test
    public void testIbanNumberCheck12() {
        assertEquals(expectedTrue,card.ibanNumberCheck("MG4600005030071289421016045"));
        assertEquals(expectedTrue,card.ibanNumberCheck("ML13ML0160120102600100668497"));
        assertEquals(expectedTrue,card.ibanNumberCheck("MA64011519000001205000534921"));
        assertEquals(expectedTrue,card.ibanNumberCheck("MZ59000301080016367102371"));
        assertEquals(expectedTrue,card.ibanNumberCheck("NI92BAMC000000000000000003123123"));
        assertEquals(expectedTrue,card.ibanNumberCheck("NE58NE0380100100130305000268"));
        assertEquals(expectedTrue,card.ibanNumberCheck("SN08SN0100152000048500003035"));
        assertEquals(expectedTrue,card.ibanNumberCheck("TG53TG0090604310346500400070"));
    }

}