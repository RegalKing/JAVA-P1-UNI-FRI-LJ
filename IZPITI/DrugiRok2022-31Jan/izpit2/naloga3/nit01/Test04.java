
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[194];
        predavalnice[0] = new Tretja.Racunalnica("R1", 22, 8);
        predavalnice[1] = new Tretja.Garaza("G1", 248, 389);
        predavalnice[2] = new Tretja.Garaza("G2", 211, 490);
        predavalnice[3] = new Tretja.Racunalnica("R2", 80, 56);
        predavalnice[4] = new Tretja.Avditorna("A1", 34);
        predavalnice[5] = new Tretja.Racunalnica("R3", 33, 30);
        predavalnice[6] = new Tretja.Racunalnica("R4", 37, 4);
        predavalnice[7] = new Tretja.Racunalnica("R5", 52, 38);
        predavalnice[8] = new Tretja.Garaza("G3", 88, 340);
        predavalnice[9] = new Tretja.Avditorna("A2", 104);
        predavalnice[10] = new Tretja.Avditorna("A3", 283);
        predavalnice[11] = new Tretja.Racunalnica("R6", 71, 70);
        predavalnice[12] = new Tretja.Racunalnica("R7", 54, 25);
        predavalnice[13] = new Tretja.Avditorna("A4", 179);
        predavalnice[14] = new Tretja.Racunalnica("R8", 24, 10);
        predavalnice[15] = new Tretja.Avditorna("A5", 124);
        predavalnice[16] = new Tretja.Garaza("G4", 76, 263);
        predavalnice[17] = new Tretja.Garaza("G5", 161, 232);
        predavalnice[18] = new Tretja.Avditorna("A6", 188);
        predavalnice[19] = new Tretja.Garaza("G6", 279, 405);
        predavalnice[20] = new Tretja.Racunalnica("R9", 95, 5);
        predavalnice[21] = new Tretja.Avditorna("A7", 240);
        predavalnice[22] = new Tretja.Garaza("G7", 193, 183);
        predavalnice[23] = new Tretja.Avditorna("A8", 204);
        predavalnice[24] = new Tretja.Avditorna("A9", 19);
        predavalnice[25] = new Tretja.Garaza("G8", 290, 395);
        predavalnice[26] = new Tretja.Garaza("G9", 245, 159);
        predavalnice[27] = new Tretja.Avditorna("A10", 196);
        predavalnice[28] = new Tretja.Avditorna("A11", 57);
        predavalnice[29] = new Tretja.Garaza("G10", 188, 172);
        predavalnice[30] = new Tretja.Avditorna("A12", 170);
        predavalnice[31] = new Tretja.Garaza("G11", 166, 273);
        predavalnice[32] = new Tretja.Garaza("G12", 59, 392);
        predavalnice[33] = new Tretja.Garaza("G13", 274, 431);
        predavalnice[34] = new Tretja.Garaza("G14", 149, 104);
        predavalnice[35] = new Tretja.Avditorna("A13", 261);
        predavalnice[36] = new Tretja.Avditorna("A14", 146);
        predavalnice[37] = new Tretja.Racunalnica("R10", 100, 48);
        predavalnice[38] = new Tretja.Garaza("G15", 94, 446);
        predavalnice[39] = new Tretja.Racunalnica("R11", 19, 4);
        predavalnice[40] = new Tretja.Racunalnica("R12", 56, 6);
        predavalnice[41] = new Tretja.Garaza("G16", 170, 116);
        predavalnice[42] = new Tretja.Racunalnica("R13", 34, 32);
        predavalnice[43] = new Tretja.Avditorna("A15", 286);
        predavalnice[44] = new Tretja.Avditorna("A16", 35);
        predavalnice[45] = new Tretja.Garaza("G17", 63, 140);
        predavalnice[46] = new Tretja.Avditorna("A17", 255);
        predavalnice[47] = new Tretja.Avditorna("A18", 144);
        predavalnice[48] = new Tretja.Avditorna("A19", 106);
        predavalnice[49] = new Tretja.Garaza("G18", 77, 329);
        predavalnice[50] = new Tretja.Racunalnica("R14", 47, 12);
        predavalnice[51] = new Tretja.Avditorna("A20", 77);
        predavalnice[52] = new Tretja.Avditorna("A21", 138);
        predavalnice[53] = new Tretja.Garaza("G19", 198, 323);
        predavalnice[54] = new Tretja.Avditorna("A22", 89);
        predavalnice[55] = new Tretja.Avditorna("A23", 235);
        predavalnice[56] = new Tretja.Garaza("G20", 274, 259);
        predavalnice[57] = new Tretja.Racunalnica("R15", 74, 17);
        predavalnice[58] = new Tretja.Racunalnica("R16", 20, 5);
        predavalnice[59] = new Tretja.Avditorna("A24", 278);
        predavalnice[60] = new Tretja.Racunalnica("R17", 81, 74);
        predavalnice[61] = new Tretja.Avditorna("A25", 25);
        predavalnice[62] = new Tretja.Garaza("G21", 222, 216);
        predavalnice[63] = new Tretja.Avditorna("A26", 31);
        predavalnice[64] = new Tretja.Racunalnica("R18", 24, 20);
        predavalnice[65] = new Tretja.Racunalnica("R19", 33, 14);
        predavalnice[66] = new Tretja.Avditorna("A27", 62);
        predavalnice[67] = new Tretja.Racunalnica("R20", 98, 56);
        predavalnice[68] = new Tretja.Avditorna("A28", 33);
        predavalnice[69] = new Tretja.Avditorna("A29", 40);
        predavalnice[70] = new Tretja.Racunalnica("R21", 97, 53);
        predavalnice[71] = new Tretja.Garaza("G22", 85, 373);
        predavalnice[72] = new Tretja.Garaza("G23", 143, 267);
        predavalnice[73] = new Tretja.Avditorna("A30", 251);
        predavalnice[74] = new Tretja.Garaza("G24", 135, 449);
        predavalnice[75] = new Tretja.Racunalnica("R22", 33, 12);
        predavalnice[76] = new Tretja.Avditorna("A31", 131);
        predavalnice[77] = new Tretja.Garaza("G25", 276, 332);
        predavalnice[78] = new Tretja.Racunalnica("R23", 68, 42);
        predavalnice[79] = new Tretja.Racunalnica("R24", 18, 14);
        predavalnice[80] = new Tretja.Garaza("G26", 293, 432);
        predavalnice[81] = new Tretja.Racunalnica("R25", 14, 2);
        predavalnice[82] = new Tretja.Avditorna("A32", 42);
        predavalnice[83] = new Tretja.Avditorna("A33", 43);
        predavalnice[84] = new Tretja.Garaza("G27", 229, 252);
        predavalnice[85] = new Tretja.Racunalnica("R26", 50, 28);
        predavalnice[86] = new Tretja.Garaza("G28", 164, 199);
        predavalnice[87] = new Tretja.Avditorna("A34", 248);
        predavalnice[88] = new Tretja.Racunalnica("R27", 25, 18);
        predavalnice[89] = new Tretja.Racunalnica("R28", 82, 31);
        predavalnice[90] = new Tretja.Avditorna("A35", 286);
        predavalnice[91] = new Tretja.Racunalnica("R29", 53, 1);
        predavalnice[92] = new Tretja.Avditorna("A36", 230);
        predavalnice[93] = new Tretja.Racunalnica("R30", 89, 88);
        predavalnice[94] = new Tretja.Garaza("G29", 71, 287);
        predavalnice[95] = new Tretja.Racunalnica("R31", 75, 35);
        predavalnice[96] = new Tretja.Racunalnica("R32", 12, 6);
        predavalnice[97] = new Tretja.Avditorna("A37", 108);
        predavalnice[98] = new Tretja.Garaza("G30", 69, 144);
        predavalnice[99] = new Tretja.Racunalnica("R33", 79, 39);
        predavalnice[100] = new Tretja.Racunalnica("R34", 99, 54);
        predavalnice[101] = new Tretja.Garaza("G31", 122, 167);
        predavalnice[102] = new Tretja.Racunalnica("R35", 44, 38);
        predavalnice[103] = new Tretja.Avditorna("A38", 78);
        predavalnice[104] = new Tretja.Avditorna("A39", 212);
        predavalnice[105] = new Tretja.Racunalnica("R36", 68, 42);
        predavalnice[106] = new Tretja.Garaza("G32", 221, 221);
        predavalnice[107] = new Tretja.Racunalnica("R37", 43, 10);
        predavalnice[108] = new Tretja.Garaza("G33", 54, 336);
        predavalnice[109] = new Tretja.Avditorna("A40", 65);
        predavalnice[110] = new Tretja.Racunalnica("R38", 82, 45);
        predavalnice[111] = new Tretja.Racunalnica("R39", 11, 7);
        predavalnice[112] = new Tretja.Racunalnica("R40", 20, 11);
        predavalnice[113] = new Tretja.Avditorna("A41", 68);
        predavalnice[114] = new Tretja.Racunalnica("R41", 30, 16);
        predavalnice[115] = new Tretja.Avditorna("A42", 186);
        predavalnice[116] = new Tretja.Avditorna("A43", 217);
        predavalnice[117] = new Tretja.Garaza("G34", 102, 227);
        predavalnice[118] = new Tretja.Avditorna("A44", 39);
        predavalnice[119] = new Tretja.Avditorna("A45", 83);
        predavalnice[120] = new Tretja.Avditorna("A46", 227);
        predavalnice[121] = new Tretja.Racunalnica("R42", 37, 26);
        predavalnice[122] = new Tretja.Racunalnica("R43", 24, 1);
        predavalnice[123] = new Tretja.Avditorna("A47", 236);
        predavalnice[124] = new Tretja.Racunalnica("R44", 91, 15);
        predavalnice[125] = new Tretja.Racunalnica("R45", 69, 3);
        predavalnice[126] = new Tretja.Avditorna("A48", 153);
        predavalnice[127] = new Tretja.Garaza("G35", 95, 229);
        predavalnice[128] = new Tretja.Avditorna("A49", 39);
        predavalnice[129] = new Tretja.Garaza("G36", 266, 378);
        predavalnice[130] = new Tretja.Racunalnica("R46", 50, 17);
        predavalnice[131] = new Tretja.Avditorna("A50", 233);
        predavalnice[132] = new Tretja.Garaza("G37", 87, 114);
        predavalnice[133] = new Tretja.Avditorna("A51", 232);
        predavalnice[134] = new Tretja.Avditorna("A52", 195);
        predavalnice[135] = new Tretja.Avditorna("A53", 233);
        predavalnice[136] = new Tretja.Avditorna("A54", 74);
        predavalnice[137] = new Tretja.Garaza("G38", 54, 211);
        predavalnice[138] = new Tretja.Avditorna("A55", 213);
        predavalnice[139] = new Tretja.Garaza("G39", 220, 144);
        predavalnice[140] = new Tretja.Garaza("G40", 266, 192);
        predavalnice[141] = new Tretja.Avditorna("A56", 88);
        predavalnice[142] = new Tretja.Avditorna("A57", 25);
        predavalnice[143] = new Tretja.Avditorna("A58", 255);
        predavalnice[144] = new Tretja.Garaza("G41", 64, 259);
        predavalnice[145] = new Tretja.Avditorna("A59", 53);
        predavalnice[146] = new Tretja.Garaza("G42", 67, 389);
        predavalnice[147] = new Tretja.Racunalnica("R47", 80, 17);
        predavalnice[148] = new Tretja.Garaza("G43", 241, 235);
        predavalnice[149] = new Tretja.Racunalnica("R48", 99, 17);
        predavalnice[150] = new Tretja.Avditorna("A60", 241);
        predavalnice[151] = new Tretja.Avditorna("A61", 17);
        predavalnice[152] = new Tretja.Garaza("G44", 173, 494);
        predavalnice[153] = new Tretja.Garaza("G45", 281, 341);
        predavalnice[154] = new Tretja.Garaza("G46", 56, 368);
        predavalnice[155] = new Tretja.Avditorna("A62", 265);
        predavalnice[156] = new Tretja.Garaza("G47", 226, 109);
        predavalnice[157] = new Tretja.Racunalnica("R49", 60, 30);
        predavalnice[158] = new Tretja.Avditorna("A63", 261);
        predavalnice[159] = new Tretja.Racunalnica("R50", 52, 30);
        predavalnice[160] = new Tretja.Avditorna("A64", 166);
        predavalnice[161] = new Tretja.Garaza("G48", 82, 427);
        predavalnice[162] = new Tretja.Avditorna("A65", 292);
        predavalnice[163] = new Tretja.Garaza("G49", 236, 331);
        predavalnice[164] = new Tretja.Garaza("G50", 159, 210);
        predavalnice[165] = new Tretja.Avditorna("A66", 32);
        predavalnice[166] = new Tretja.Garaza("G51", 247, 141);
        predavalnice[167] = new Tretja.Avditorna("A67", 247);
        predavalnice[168] = new Tretja.Garaza("G52", 135, 319);
        predavalnice[169] = new Tretja.Racunalnica("R51", 87, 31);
        predavalnice[170] = new Tretja.Garaza("G53", 229, 466);
        predavalnice[171] = new Tretja.Racunalnica("R52", 92, 16);
        predavalnice[172] = new Tretja.Garaza("G54", 282, 109);
        predavalnice[173] = new Tretja.Racunalnica("R53", 66, 10);
        predavalnice[174] = new Tretja.Racunalnica("R54", 65, 41);
        predavalnice[175] = new Tretja.Racunalnica("R55", 68, 49);
        predavalnice[176] = new Tretja.Racunalnica("R56", 76, 69);
        predavalnice[177] = new Tretja.Avditorna("A68", 96);
        predavalnice[178] = new Tretja.Avditorna("A69", 91);
        predavalnice[179] = new Tretja.Avditorna("A70", 275);
        predavalnice[180] = new Tretja.Avditorna("A71", 81);
        predavalnice[181] = new Tretja.Racunalnica("R57", 79, 71);
        predavalnice[182] = new Tretja.Garaza("G55", 265, 203);
        predavalnice[183] = new Tretja.Garaza("G56", 216, 266);
        predavalnice[184] = new Tretja.Avditorna("A72", 88);
        predavalnice[185] = new Tretja.Racunalnica("R58", 31, 18);
        predavalnice[186] = new Tretja.Garaza("G57", 57, 318);
        predavalnice[187] = new Tretja.Racunalnica("R59", 52, 11);
        predavalnice[188] = new Tretja.Avditorna("A73", 143);
        predavalnice[189] = new Tretja.Racunalnica("R60", 25, 20);
        predavalnice[190] = new Tretja.Avditorna("A74", 249);
        predavalnice[191] = new Tretja.Garaza("G58", 98, 402);
        predavalnice[192] = new Tretja.Garaza("G59", 140, 364);
        predavalnice[193] = new Tretja.Avditorna("A75", 127);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
