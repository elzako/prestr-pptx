package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;

public class i1 implements v7 {
   private List<i1> n5;
   private v0 l6;
   private s1 k5;
   private s1 u3;
   private String[] a6;
   private Object u9 = new Object();
   private Object h0 = new Object();
   private Object c8 = new Object();

   public i1(v0 var1) {
      this.n5 = new List<>();
      this.l6 = var1;
   }

   @Override
   public final int n5(r9 var1) {
      k3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class);
      return var2 != null ? com.aspose.slides.internal.g7.u9.n5.n5(var2.n5()) : 0;
   }

   @Override
   public final void n5(int var1, int var2) {
      throw new NotSupportedException();
   }

   @Override
   public final r9 n5(int var1) {
      int var2 = com.aspose.slides.internal.g7.u9.n5.n5((char)(var1 & 65535));

      for (int var3 = 0; var3 < var2; var3++) {
         String var4 = com.aspose.slides.internal.g7.u9.n5.n5((char)(var1 & 65535), var3);
         if (this.n5().l6(var4) && this.n5().n5(var4) != 0) {
            return new k3(var4);
         }
      }

      return k3.n5;
   }

   @Override
   public final r9 l6(int var1) {
      return var1 < this.l6.n5().t2().l6().length ? new k2(this.l6.n5().t2().l6()[(char)(var1 & 65535)] & 65535) : new k2(0);
   }

   public final s1 n5() {
      if (this.k5 == null) {
         synchronized (this.c8) {
            if (this.k5 == null) {
               this.k5 = new s1();

               for (int var2 = 0; var2 < 256; var2++) {
                  int var3 = this.l6.n5().s7().l6[var2] & 65535;
                  String var4 = this.k5(var3);
                  if (!this.k5.l6(var4)) {
                     this.k5.l6(var4, var2);
                  }
               }
            }
         }
      }

      return this.k5;
   }

   public final s1 l6() {
      if (this.u3 == null) {
         synchronized (this.h0) {
            if (this.u3 == null) {
               this.u3 = new s1();

               for (int var2 = 0; var2 <= 390 + this.l6.n5().a6().k5(); var2++) {
                  String var3 = this.k5(var2);
                  this.u3.n5(var3, var2);
               }
            }
         }
      }

      return this.u3;
   }

   private String k5(int var1) {
      int var2 = 0;
      int var3 = 0;
      String var6;
      if (var1 > 390) {
         int[] var4 = new int[]{0};
         int[] var5 = new int[]{0};
         this.l6.n5().a6().n5(var1 - 390 - 1, var4, var5);
         var2 = var4[0];
         var3 = var5[0];
         var6 = com.aspose.slides.internal.l7h.j5.e2().l6(this.l6.n5().a6().u9(), var2, var3);
      } else {
         var6 = this.k5()[var1];
      }

      return var6;
   }

   protected final String[] k5() {
      if (this.a6 == null) {
         synchronized (this.u9) {
            if (this.a6 == null) {
               this.a6 = new String[391];
               this.u3();
            }
         }
      }

      return this.a6;
   }

   private void u3() {
      this.a6[0] = ".notdef";
      this.a6[1] = "space";
      this.a6[2] = "exclam";
      this.a6[3] = "quotedbl";
      this.a6[4] = "numbersign";
      this.a6[5] = "dollar";
      this.a6[6] = "percent";
      this.a6[7] = "ampersand";
      this.a6[8] = "quoteright";
      this.a6[9] = "parenleft";
      this.a6[10] = "parenright";
      this.a6[11] = "asterisk";
      this.a6[12] = "plus";
      this.a6[13] = "comma";
      this.a6[14] = "hyphen";
      this.a6[15] = "period";
      this.a6[16] = "slash";
      this.a6[17] = "zero";
      this.a6[18] = "one";
      this.a6[19] = "two";
      this.a6[20] = "three";
      this.a6[21] = "four";
      this.a6[22] = "five";
      this.a6[23] = "six";
      this.a6[24] = "seven";
      this.a6[25] = "eight";
      this.a6[26] = "nine";
      this.a6[27] = "colon";
      this.a6[28] = "semicolon";
      this.a6[29] = "less";
      this.a6[30] = "equal";
      this.a6[31] = "greater";
      this.a6[32] = "question";
      this.a6[33] = "at";
      this.a6[34] = "A";
      this.a6[35] = "B";
      this.a6[36] = "C";
      this.a6[37] = "D";
      this.a6[38] = "E";
      this.a6[39] = "F";
      this.a6[40] = "G";
      this.a6[41] = "H";
      this.a6[42] = "I";
      this.a6[43] = "J";
      this.a6[44] = "K";
      this.a6[45] = "L";
      this.a6[46] = "M";
      this.a6[47] = "N";
      this.a6[48] = "O";
      this.a6[49] = "P";
      this.a6[50] = "Q";
      this.a6[51] = "R";
      this.a6[52] = "S";
      this.a6[53] = "T";
      this.a6[54] = "U";
      this.a6[55] = "V";
      this.a6[56] = "W";
      this.a6[57] = "X";
      this.a6[58] = "Y";
      this.a6[59] = "Z";
      this.a6[60] = "bracketleft";
      this.a6[61] = "backslash";
      this.a6[62] = "bracketright";
      this.a6[63] = "asciicircum";
      this.a6[64] = "underscore";
      this.a6[65] = "quoteleft";
      this.a6[66] = "a";
      this.a6[67] = "b";
      this.a6[68] = "c";
      this.a6[69] = "d";
      this.a6[70] = "e";
      this.a6[71] = "f";
      this.a6[72] = "g";
      this.a6[73] = "h";
      this.a6[74] = "i";
      this.a6[75] = "j";
      this.a6[76] = "k";
      this.a6[77] = "l";
      this.a6[78] = "m";
      this.a6[79] = "n";
      this.a6[80] = "o";
      this.a6[81] = "p";
      this.a6[82] = "q";
      this.a6[83] = "r";
      this.a6[84] = "s";
      this.a6[85] = "t";
      this.a6[86] = "u";
      this.a6[87] = "v";
      this.a6[88] = "w";
      this.a6[89] = "x";
      this.a6[90] = "y";
      this.a6[91] = "z";
      this.a6[92] = "braceleft";
      this.a6[93] = "bar";
      this.a6[94] = "braceright";
      this.a6[95] = "asciitilde";
      this.a6[96] = "exclamdown";
      this.a6[97] = "cent";
      this.a6[98] = "sterling";
      this.a6[99] = "fraction";
      this.a6[100] = "yen";
      this.a6[101] = "florin";
      this.a6[102] = "section";
      this.a6[103] = "currency";
      this.a6[104] = "quotesingle";
      this.a6[105] = "quotedblleft";
      this.a6[106] = "guillemotleft";
      this.a6[107] = "guilsinglleft";
      this.a6[108] = "guilsinglright";
      this.a6[109] = "fi";
      this.a6[110] = "fl";
      this.a6[111] = "endash";
      this.a6[112] = "dagger";
      this.a6[113] = "daggerdbl";
      this.a6[114] = "periodcentered";
      this.a6[115] = "paragraph";
      this.a6[116] = "bullet";
      this.a6[117] = "quotesinglbase";
      this.a6[118] = "quotedblbase";
      this.a6[119] = "quotedblright";
      this.a6[120] = "guillemotright";
      this.a6[121] = "ellipsis";
      this.a6[122] = "perthousand";
      this.a6[123] = "questiondown";
      this.a6[124] = "grave";
      this.a6[125] = "acute";
      this.a6[126] = "circumflex";
      this.a6[127] = "tilde";
      this.a6[128] = "macron";
      this.a6[129] = "breve";
      this.a6[130] = "dotaccent";
      this.a6[131] = "dieresis";
      this.a6[132] = "ring";
      this.a6[133] = "cedilla";
      this.a6[134] = "hungarumlaut";
      this.a6[135] = "ogonek";
      this.a6[136] = "caron";
      this.a6[137] = "emdash";
      this.a6[138] = "AE";
      this.a6[139] = "ordfeminine";
      this.a6[140] = "Lslash";
      this.a6[141] = "Oslash";
      this.a6[142] = "OE";
      this.a6[143] = "ordmasculine";
      this.a6[144] = "ae";
      this.a6[145] = "dotlessi";
      this.a6[146] = "lslash";
      this.a6[147] = "oslash";
      this.a6[148] = "oe";
      this.a6[149] = "germandbls";
      this.a6[150] = "onesuperior";
      this.a6[151] = "logicalnot";
      this.a6[152] = "mu";
      this.a6[153] = "trademark";
      this.a6[154] = "Eth";
      this.a6[155] = "onehalf";
      this.a6[156] = "plusminus ";
      this.a6[157] = "Thorn";
      this.a6[158] = "onequarter";
      this.a6[159] = "divide";
      this.a6[160] = "brokenbar";
      this.a6[161] = "degree";
      this.a6[162] = "thorn";
      this.a6[163] = "threequarters";
      this.a6[164] = "twosuperior";
      this.a6[165] = "registered";
      this.a6[166] = "minus";
      this.a6[167] = "eth";
      this.a6[168] = "multiply";
      this.a6[169] = "threesuperior";
      this.a6[170] = "copyright";
      this.a6[171] = "Aacute";
      this.a6[172] = "Acircumflex";
      this.a6[173] = "Adieresis";
      this.a6[174] = "Agrave";
      this.a6[175] = "Aring";
      this.a6[176] = "Atilde";
      this.a6[177] = "Ccedilla";
      this.a6[178] = "Eacute";
      this.a6[179] = "Ecircumflex";
      this.a6[180] = "Edieresis";
      this.a6[181] = "Egrave";
      this.a6[182] = "Iacute";
      this.a6[183] = "Icircumflex";
      this.a6[184] = "Idieresis";
      this.a6[185] = "Igrave";
      this.a6[186] = "Ntilde";
      this.a6[187] = "Oacute";
      this.a6[188] = "Ocircumflex";
      this.a6[189] = "Odieresis";
      this.a6[190] = "Ograve";
      this.a6[191] = "Otilde";
      this.a6[192] = "Scaron";
      this.a6[193] = "Uacute";
      this.a6[194] = "Ucircumflex";
      this.a6[195] = "Udieresis";
      this.a6[196] = "Ugrave";
      this.a6[197] = "Yacute";
      this.a6[198] = "Ydieresis";
      this.a6[199] = "Zcaron";
      this.a6[200] = "aacute";
      this.a6[201] = "acircumflex";
      this.a6[202] = "adieresis";
      this.a6[203] = "agrave";
      this.a6[204] = "aring";
      this.a6[205] = "atilde";
      this.a6[206] = "ccedilla";
      this.a6[207] = "eacute";
      this.a6[208] = "ecircumflex";
      this.a6[209] = "edieresis";
      this.a6[210] = "egrave";
      this.a6[211] = "iacute";
      this.a6[212] = "icircumflex";
      this.a6[213] = "idieresis";
      this.a6[214] = "igrave";
      this.a6[215] = "ntilde";
      this.a6[216] = "oacute";
      this.a6[217] = "ocircumflex";
      this.a6[218] = "odieresis";
      this.a6[219] = "ograve";
      this.a6[220] = "otilde";
      this.a6[221] = "scaron";
      this.a6[222] = "uacute";
      this.a6[223] = "ucircumflex";
      this.a6[224] = "udieresis";
      this.a6[225] = "ugrave";
      this.a6[226] = "yacute";
      this.a6[227] = "ydieresis";
      this.a6[228] = "zcaron";
      this.a6[229] = "exclamsmall";
      this.a6[230] = "Hungarumlautsmall";
      this.a6[231] = "dollaroldstyle";
      this.a6[232] = "dollarsuperior";
      this.a6[233] = "ampersandsmall";
      this.a6[234] = "Acutesmall";
      this.a6[235] = "parenleftsuperior";
      this.a6[236] = "parenrightsuperior";
      this.a6[237] = "twodotenleader";
      this.a6[238] = "onedotenleader";
      this.a6[239] = "zerooldstyle";
      this.a6[240] = "oneoldstyle";
      this.a6[241] = "twooldstyle";
      this.a6[242] = "threeoldstyle";
      this.a6[243] = "fouroldstyle";
      this.a6[244] = "fiveoldstyle";
      this.a6[245] = "sixoldstyle";
      this.a6[246] = "sevenoldstyle";
      this.a6[247] = "eightoldstyle";
      this.a6[248] = "nineoldstyle";
      this.a6[249] = "commasuperior";
      this.a6[250] = "threequartersemdash";
      this.a6[251] = "periodsuperior";
      this.a6[252] = "questionsmall";
      this.a6[253] = "asuperior";
      this.a6[254] = "bsuperior";
      this.a6[255] = "centsuperior";
      this.a6[256] = "dsuperior";
      this.a6[257] = "esuperior";
      this.a6[258] = "isuperior";
      this.a6[259] = "lsuperior";
      this.a6[260] = "msuperior";
      this.a6[261] = "nsuperior";
      this.a6[262] = "osuperior";
      this.a6[263] = "rsuperior";
      this.a6[264] = "ssuperior";
      this.a6[265] = "tsuperior";
      this.a6[266] = "ff";
      this.a6[267] = "ffi";
      this.a6[268] = "ffl";
      this.a6[269] = "parenleftinferior";
      this.a6[270] = "parenrightinferior";
      this.a6[271] = "Circumflexsmall";
      this.a6[272] = "hyphensuperior";
      this.a6[273] = "Gravesmall";
      this.a6[274] = "Asmall";
      this.a6[275] = "Bsmall";
      this.a6[276] = "Csmall";
      this.a6[277] = "Dsmall";
      this.a6[278] = "Esmall";
      this.a6[279] = "Fsmall";
      this.a6[280] = "Gsmall";
      this.a6[281] = "Hsmall";
      this.a6[282] = "Ismall";
      this.a6[283] = "Jsmall";
      this.a6[284] = "Ksmall";
      this.a6[285] = "Lsmall";
      this.a6[286] = "Msmall";
      this.a6[287] = "Nsmall";
      this.a6[288] = "Osmall";
      this.a6[289] = "Psmall";
      this.a6[290] = "Qsmall";
      this.a6[291] = "Rsmall";
      this.a6[292] = "Ssmall";
      this.a6[293] = "Tsmall";
      this.a6[294] = "Usmall";
      this.a6[295] = "Vsmall";
      this.a6[296] = "Wsmall";
      this.a6[297] = "Xsmall";
      this.a6[298] = "Ysmall";
      this.a6[299] = "Zsmall";
      this.a6[300] = "colonmonetary";
      this.a6[301] = "onefitted";
      this.a6[302] = "rupiah";
      this.a6[303] = "Tildesmall";
      this.a6[304] = "exclamdownsmall";
      this.a6[305] = "centoldstyle";
      this.a6[306] = "Lslashsmall";
      this.a6[307] = "Scaronsmall";
      this.a6[308] = "Zcaronsmall";
      this.a6[309] = "Dieresissmall";
      this.a6[310] = "Brevesmall";
      this.a6[311] = "Caronsmall";
      this.a6[312] = "Dotaccentsmall";
      this.a6[313] = "Macronsmall";
      this.a6[314] = "figuredash";
      this.a6[315] = "hypheninferior";
      this.a6[316] = "Ogoneksmall";
      this.a6[317] = "Ringsmall";
      this.a6[318] = "Cedillasmall";
      this.a6[319] = "questiondownsmall";
      this.a6[320] = "oneeighth";
      this.a6[321] = "threeeighths";
      this.a6[322] = "fiveeighths";
      this.a6[323] = "seveneighths";
      this.a6[324] = "onethird";
      this.a6[325] = "twothirds";
      this.a6[326] = "zerosuperior";
      this.a6[327] = "foursuperior";
      this.a6[328] = "fivesuperior";
      this.a6[329] = "sixsuperior";
      this.a6[330] = "sevensuperior";
      this.a6[331] = "eightsuperior";
      this.a6[332] = "ninesuperior";
      this.a6[333] = "zeroinferior";
      this.a6[334] = "oneinferior";
      this.a6[335] = "twoinferior";
      this.a6[336] = "threeinferior";
      this.a6[337] = "fourinferior";
      this.a6[338] = "fiveinferior";
      this.a6[339] = "sixinferior";
      this.a6[340] = "seveninferior";
      this.a6[341] = "eightinferior";
      this.a6[342] = "nineinferior";
      this.a6[343] = "centinferior";
      this.a6[344] = "dollarinferior";
      this.a6[345] = "periodinferior";
      this.a6[346] = "commainferior";
      this.a6[347] = "Agravesmall";
      this.a6[348] = "Aacutesmall";
      this.a6[349] = "Acircumflexsmall";
      this.a6[350] = "Atildesmall";
      this.a6[351] = "Adieresissmall";
      this.a6[352] = "Aringsmall";
      this.a6[353] = "AEsmall";
      this.a6[354] = "Ccedillasmall";
      this.a6[355] = "Egravesmall";
      this.a6[356] = "Eacutesmall";
      this.a6[357] = "Ecircumflexsmall";
      this.a6[358] = "Edieresissmall";
      this.a6[359] = "Igravesmall";
      this.a6[360] = "Iacutesmall";
      this.a6[361] = "Icircumflexsmall";
      this.a6[362] = "Idieresissmall";
      this.a6[363] = "Ethsmall";
      this.a6[364] = "Ntildesmall";
      this.a6[365] = "Ogravesmall";
      this.a6[366] = "Oacutesmall";
      this.a6[367] = "Ocircumflexsmall";
      this.a6[368] = "Otildesmall";
      this.a6[369] = "Odieresissmall";
      this.a6[370] = "OEsmall";
      this.a6[371] = "Oslashsmall";
      this.a6[372] = "Ugravesmall";
      this.a6[373] = "Uacutesmall";
      this.a6[374] = "Ucircumflexsmall";
      this.a6[375] = "Udieresissmall";
      this.a6[376] = "Yacutesmall";
      this.a6[377] = "Thornsmall";
      this.a6[378] = "Ydieresissmall";
      this.a6[379] = "001.000";
      this.a6[380] = "001.001";
      this.a6[381] = "001.002";
      this.a6[382] = "001.003";
      this.a6[383] = "Black";
      this.a6[384] = "Bold";
      this.a6[385] = "Book";
      this.a6[386] = "Light";
      this.a6[387] = "Medium";
      this.a6[388] = "Regular";
      this.a6[389] = "Roman";
      this.a6[390] = "Semibold";
   }
}
