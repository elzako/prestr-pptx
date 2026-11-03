package com.aspose.slides.internal.f0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class t2 extends n5 {
   private static final List<String> l6;
   private static final int[] k5 = new int[256];
   private final com.aspose.slides.internal.v0.l6 u3 = com.aspose.slides.internal.v0.l6.n5("WinAnsiEncoding");
   private static final Dictionary<Integer, Dictionary<Integer, Integer>> a6 = new Dictionary<>();
   private boolean u9 = false;

   public t2() {
      this(false);
   }

   public t2(boolean var1) {
      this.u9 = var1;
   }

   @Override
   public String n5() {
      return "WinAnsiEncoding";
   }

   @Override
   public String l6() {
      return "Helvetica-BoldOblique";
   }

   @Override
   public String k5() {
      return "Helvetica Bold Oblique";
   }

   @Override
   public int l6(int var1) {
      return var1 * 718;
   }

   @Override
   public int k5(int var1) {
      return var1 * 718;
   }

   @Override
   public int u3(int var1) {
      return var1 * -207;
   }

   @Override
   public int a6(int var1) {
      return var1 * 532;
   }

   @Override
   public int n5(int var1, int var2) {
      return var2 * k5[var1];
   }

   @Override
   public boolean u3() {
      return this.u9;
   }

   @Override
   public Dictionary<Integer, Dictionary<Integer, Integer>> a6() {
      return a6;
   }

   @Override
   public int n5(int var1) {
      this.u9();
      int var2 = this.u3.n5(var1);
      if (var2 != 0) {
         return var2;
      }

      this.u9(var1);
      return 35;
   }

   @Override
   public boolean n5(char var1) {
      return this.u3.n5(var1) > 0;
   }

   static {
      k5[65] = 722;
      k5[198] = 1000;
      k5[193] = 722;
      k5[194] = 722;
      k5[196] = 722;
      k5[192] = 722;
      k5[197] = 722;
      k5[195] = 722;
      k5[66] = 722;
      k5[67] = 722;
      k5[199] = 722;
      k5[68] = 722;
      k5[69] = 667;
      k5[201] = 667;
      k5[202] = 667;
      k5[203] = 667;
      k5[200] = 667;
      k5[208] = 722;
      k5[128] = 556;
      k5[70] = 611;
      k5[71] = 778;
      k5[72] = 722;
      k5[73] = 278;
      k5[205] = 278;
      k5[206] = 278;
      k5[207] = 278;
      k5[204] = 278;
      k5[74] = 556;
      k5[75] = 722;
      k5[76] = 611;
      k5[77] = 833;
      k5[78] = 722;
      k5[209] = 722;
      k5[79] = 778;
      k5[140] = 1000;
      k5[211] = 778;
      k5[212] = 778;
      k5[214] = 778;
      k5[210] = 778;
      k5[216] = 778;
      k5[213] = 778;
      k5[80] = 667;
      k5[81] = 778;
      k5[82] = 722;
      k5[83] = 667;
      k5[138] = 667;
      k5[84] = 611;
      k5[222] = 667;
      k5[85] = 722;
      k5[218] = 722;
      k5[219] = 722;
      k5[220] = 722;
      k5[217] = 722;
      k5[86] = 667;
      k5[87] = 944;
      k5[88] = 667;
      k5[89] = 667;
      k5[221] = 667;
      k5[159] = 667;
      k5[90] = 611;
      k5[142] = 611;
      k5[97] = 556;
      k5[225] = 556;
      k5[226] = 556;
      k5[180] = 333;
      k5[228] = 556;
      k5[230] = 889;
      k5[224] = 556;
      k5[38] = 722;
      k5[229] = 556;
      k5[94] = 584;
      k5[126] = 584;
      k5[42] = 389;
      k5[64] = 975;
      k5[227] = 556;
      k5[98] = 611;
      k5[92] = 278;
      k5[124] = 280;
      k5[123] = 389;
      k5[125] = 389;
      k5[91] = 333;
      k5[93] = 333;
      k5[166] = 280;
      k5[149] = 350;
      k5[99] = 556;
      k5[231] = 556;
      k5[184] = 333;
      k5[162] = 556;
      k5[136] = 333;
      k5[58] = 333;
      k5[44] = 278;
      k5[169] = 737;
      k5[164] = 556;
      k5[100] = 611;
      k5[134] = 556;
      k5[135] = 556;
      k5[176] = 400;
      k5[168] = 333;
      k5[247] = 584;
      k5[36] = 556;
      k5[101] = 556;
      k5[233] = 556;
      k5[234] = 556;
      k5[235] = 556;
      k5[232] = 556;
      k5[56] = 556;
      k5[133] = 1000;
      k5[151] = 1000;
      k5[150] = 556;
      k5[61] = 584;
      k5[240] = 611;
      k5[33] = 333;
      k5[161] = 333;
      k5[102] = 333;
      k5[53] = 556;
      k5[131] = 556;
      k5[52] = 556;
      k5[103] = 611;
      k5[223] = 611;
      k5[96] = 333;
      k5[62] = 584;
      k5[171] = 556;
      k5[187] = 556;
      k5[139] = 333;
      k5[155] = 333;
      k5[104] = 611;
      k5[45] = 333;
      k5[105] = 278;
      k5[237] = 278;
      k5[238] = 278;
      k5[239] = 278;
      k5[236] = 278;
      k5[106] = 278;
      k5[107] = 556;
      k5[108] = 278;
      k5[60] = 584;
      k5[172] = 584;
      k5[109] = 889;
      k5[175] = 333;
      k5[181] = 611;
      k5[215] = 584;
      k5[110] = 611;
      k5[57] = 556;
      k5[241] = 611;
      k5[35] = 556;
      k5[111] = 611;
      k5[243] = 611;
      k5[244] = 611;
      k5[246] = 611;
      k5[156] = 944;
      k5[242] = 611;
      k5[49] = 556;
      k5[189] = 834;
      k5[188] = 834;
      k5[185] = 333;
      k5[170] = 370;
      k5[186] = 365;
      k5[248] = 611;
      k5[245] = 611;
      k5[112] = 611;
      k5[182] = 556;
      k5[40] = 333;
      k5[41] = 333;
      k5[37] = 889;
      k5[46] = 278;
      k5[183] = 278;
      k5[137] = 1000;
      k5[43] = 584;
      k5[177] = 584;
      k5[113] = 611;
      k5[63] = 611;
      k5[191] = 611;
      k5[34] = 474;
      k5[132] = 500;
      k5[147] = 500;
      k5[148] = 500;
      k5[145] = 278;
      k5[146] = 278;
      k5[130] = 278;
      k5[39] = 238;
      k5[114] = 389;
      k5[174] = 737;
      k5[115] = 556;
      k5[154] = 556;
      k5[167] = 556;
      k5[59] = 333;
      k5[55] = 556;
      k5[54] = 556;
      k5[47] = 278;
      k5[32] = 278;
      k5[163] = 556;
      k5[116] = 333;
      k5[254] = 611;
      k5[51] = 556;
      k5[190] = 834;
      k5[179] = 333;
      k5[152] = 333;
      k5[153] = 1000;
      k5[50] = 556;
      k5[178] = 333;
      k5[117] = 611;
      k5[250] = 611;
      k5[251] = 611;
      k5[252] = 611;
      k5[249] = 611;
      k5[95] = 556;
      k5[118] = 556;
      k5[119] = 778;
      k5[120] = 556;
      k5[121] = 556;
      k5[253] = 556;
      k5[255] = 556;
      k5[165] = 556;
      k5[122] = 500;
      k5[158] = 500;
      k5[48] = 556;
      Dictionary var0 = null;
      short var1 = 107;
      Dictionary[] var2 = new Dictionary[]{var0};
      boolean var3 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var3) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      short var4 = 111;
      var0.addItem(Integer.valueOf(var4), -15);
      var1 = (byte)79;
      var2[0] = var0;
      boolean var5 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var5) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)87;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)89;
      var0.addItem(Integer.valueOf(var4), -70);
      var4 = (byte)84;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)86;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)88;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -40);
      var1 = (byte)104;
      var2[0] = var0;
      boolean var6 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var6) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), -20);
      var1 = (byte)99;
      var2[0] = var0;
      boolean var7 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var7) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)107;
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)104;
      var0.addItem(Integer.valueOf(var4), -10);
      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), -10);
      var4 = (byte)108;
      var0.addItem(Integer.valueOf(var4), -20);
      var1 = (byte)87;
      var2[0] = var0;
      boolean var8 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var8) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -60);
      var4 = (byte)45;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)79;
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)58;
      var0.addItem(Integer.valueOf(var4), -10);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -60);
      var4 = (byte)117;
      var0.addItem(Integer.valueOf(var4), -45);
      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -35);
      var4 = (byte)59;
      var0.addItem(Integer.valueOf(var4), -10);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -80);
      var1 = (byte)112;
      var2[0] = var0;
      boolean var9 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var9) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), -15);
      var1 = (byte)80;
      var2[0] = var0;
      boolean var10 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var10) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -100);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -120);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -120);
      var1 = (byte)86;
      var2[0] = var0;
      boolean var11 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var11) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -90);
      var4 = (byte)45;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)79;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)58;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -60);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)117;
      var0.addItem(Integer.valueOf(var4), -60);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -120);
      var4 = (byte)71;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)59;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -120);
      var1 = (byte)59;
      var2[0] = var0;
      boolean var12 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var12) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)32;
      var0.addItem(Integer.valueOf(var4), -40);
      var1 = (byte)118;
      var2[0] = var0;
      boolean var13 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var13) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -80);
      var1 = (byte)32;
      var2[0] = var0;
      boolean var14 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var14) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)87;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = 147;
      var0.addItem(Integer.valueOf(var4), -80);
      short var189 = 89;
      var0.addItem(Integer.valueOf(var189), -120);
      var189 = (byte)84;
      var0.addItem(Integer.valueOf(var189), -100);
      var189 = 145;
      var0.addItem(Integer.valueOf(var189), -60);
      short var192 = 86;
      var0.addItem(Integer.valueOf(var192), -80);
      var1 = (byte)97;
      var2[0] = var0;
      boolean var15 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var15) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)119;
      var0.addItem(Integer.valueOf(var192), -15);
      var192 = (byte)121;
      var0.addItem(Integer.valueOf(var192), -20);
      var192 = (byte)103;
      var0.addItem(Integer.valueOf(var192), -10);
      var192 = (byte)118;
      var0.addItem(Integer.valueOf(var192), -15);
      var1 = (byte)65;
      var2[0] = var0;
      boolean var16 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var16) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)79;
      var0.addItem(Integer.valueOf(var192), -40);
      var192 = (byte)119;
      var0.addItem(Integer.valueOf(var192), -30);
      var192 = (byte)87;
      var0.addItem(Integer.valueOf(var192), -60);
      var192 = (byte)67;
      var0.addItem(Integer.valueOf(var192), -40);
      var192 = (byte)81;
      var0.addItem(Integer.valueOf(var192), -40);
      var192 = (byte)71;
      var0.addItem(Integer.valueOf(var192), -50);
      var192 = (byte)86;
      var0.addItem(Integer.valueOf(var192), -80);
      var192 = (byte)118;
      var0.addItem(Integer.valueOf(var192), -40);
      var192 = (byte)85;
      var0.addItem(Integer.valueOf(var192), -50);
      var192 = (byte)117;
      var0.addItem(Integer.valueOf(var192), -30);
      var192 = (byte)89;
      var0.addItem(Integer.valueOf(var192), -110);
      var192 = (byte)84;
      var0.addItem(Integer.valueOf(var192), -90);
      var192 = (byte)121;
      var0.addItem(Integer.valueOf(var192), -30);
      var1 = (byte)70;
      var2[0] = var0;
      boolean var17 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var17) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)97;
      var0.addItem(Integer.valueOf(var192), -20);
      var192 = (byte)65;
      var0.addItem(Integer.valueOf(var192), -80);
      var192 = (byte)46;
      var0.addItem(Integer.valueOf(var192), -100);
      var192 = (byte)44;
      var0.addItem(Integer.valueOf(var192), -100);
      var1 = (byte)85;
      var2[0] = var0;
      boolean var18 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var18) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)65;
      var0.addItem(Integer.valueOf(var192), -50);
      var192 = (byte)46;
      var0.addItem(Integer.valueOf(var192), -30);
      var192 = (byte)44;
      var0.addItem(Integer.valueOf(var192), -30);
      var1 = (byte)115;
      var2[0] = var0;
      boolean var19 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var19) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)119;
      var0.addItem(Integer.valueOf(var192), -15);
      var1 = (byte)111;
      var2[0] = var0;
      boolean var20 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var20) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)119;
      var0.addItem(Integer.valueOf(var192), -15);
      var192 = (byte)121;
      var0.addItem(Integer.valueOf(var192), -20);
      var192 = (byte)120;
      var0.addItem(Integer.valueOf(var192), -30);
      var192 = (byte)118;
      var0.addItem(Integer.valueOf(var192), -20);
      var1 = (byte)122;
      var2[0] = var0;
      boolean var21 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var21) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)101;
      var0.addItem(Integer.valueOf(var192), 10);
      var1 = (byte)100;
      var2[0] = var0;
      boolean var22 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var22) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)100;
      var0.addItem(Integer.valueOf(var192), -10);
      var192 = (byte)119;
      var0.addItem(Integer.valueOf(var192), -15);
      var192 = (byte)121;
      var0.addItem(Integer.valueOf(var192), -15);
      var192 = (byte)118;
      var0.addItem(Integer.valueOf(var192), -15);
      var1 = (byte)68;
      var2[0] = var0;
      boolean var23 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var23) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)65;
      var0.addItem(Integer.valueOf(var192), -40);
      var192 = (byte)87;
      var0.addItem(Integer.valueOf(var192), -40);
      var192 = (byte)89;
      var0.addItem(Integer.valueOf(var192), -70);
      var192 = (byte)46;
      var0.addItem(Integer.valueOf(var192), -30);
      var192 = (byte)86;
      var0.addItem(Integer.valueOf(var192), -40);
      var192 = (byte)44;
      var0.addItem(Integer.valueOf(var192), -30);
      var1 = 146;
      var2[0] = var0;
      boolean var24 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var24) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var192 = (byte)100;
      var0.addItem(Integer.valueOf(var192), -80);
      var192 = (byte)32;
      var0.addItem(Integer.valueOf(var192), -80);
      var192 = 146;
      var0.addItem(Integer.valueOf(var192), -46);
      short var236 = 114;
      var0.addItem(Integer.valueOf(var236), -40);
      var236 = (byte)108;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)115;
      var0.addItem(Integer.valueOf(var236), -60);
      var236 = (byte)118;
      var0.addItem(Integer.valueOf(var236), -20);
      short var114 = 82;
      var2[0] = var0;
      boolean var25 = !a6.tryGetValue(Integer.valueOf(var114), var2);
      var0 = var2[0];
      if (var25) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var114), var0);
      }

      var236 = (byte)79;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)87;
      var0.addItem(Integer.valueOf(var236), -40);
      var236 = (byte)85;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)89;
      var0.addItem(Integer.valueOf(var236), -50);
      var236 = (byte)84;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)86;
      var0.addItem(Integer.valueOf(var236), -50);
      var114 = (byte)75;
      var2[0] = var0;
      boolean var26 = !a6.tryGetValue(Integer.valueOf(var114), var2);
      var0 = var2[0];
      if (var26) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var114), var0);
      }

      var236 = (byte)111;
      var0.addItem(Integer.valueOf(var236), -35);
      var236 = (byte)79;
      var0.addItem(Integer.valueOf(var236), -30);
      var236 = (byte)117;
      var0.addItem(Integer.valueOf(var236), -30);
      var236 = (byte)121;
      var0.addItem(Integer.valueOf(var236), -40);
      var236 = (byte)101;
      var0.addItem(Integer.valueOf(var236), -15);
      var114 = (byte)58;
      var2[0] = var0;
      boolean var27 = !a6.tryGetValue(Integer.valueOf(var114), var2);
      var0 = var2[0];
      if (var27) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var114), var0);
      }

      var236 = (byte)32;
      var0.addItem(Integer.valueOf(var236), -40);
      var114 = (byte)119;
      var2[0] = var0;
      boolean var28 = !a6.tryGetValue(Integer.valueOf(var114), var2);
      var0 = var2[0];
      if (var28) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var114), var0);
      }

      var236 = (byte)111;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)46;
      var0.addItem(Integer.valueOf(var236), -40);
      var236 = (byte)44;
      var0.addItem(Integer.valueOf(var236), -40);
      var114 = (byte)114;
      var2[0] = var0;
      boolean var29 = !a6.tryGetValue(Integer.valueOf(var114), var2);
      var0 = var2[0];
      if (var29) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var114), var0);
      }

      var236 = (byte)111;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)100;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)45;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)99;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)116;
      var0.addItem(Integer.valueOf(var236), 20);
      var236 = (byte)121;
      var0.addItem(Integer.valueOf(var236), 10);
      var236 = (byte)46;
      var0.addItem(Integer.valueOf(var236), -60);
      var236 = (byte)103;
      var0.addItem(Integer.valueOf(var236), -15);
      var236 = (byte)113;
      var0.addItem(Integer.valueOf(var236), -20);
      var236 = (byte)115;
      var0.addItem(Integer.valueOf(var236), -15);
      var236 = (byte)118;
      var0.addItem(Integer.valueOf(var236), 10);
      var236 = (byte)44;
      var0.addItem(Integer.valueOf(var236), -60);
      var114 = 145;
      var2[0] = var0;
      boolean var30 = !a6.tryGetValue(Integer.valueOf(var114), var2);
      var0 = var2[0];
      if (var30) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var114), var0);
      }

      var236 = 145;
      var0.addItem(Integer.valueOf(var236), -46);
      short var120 = 108;
      var2[0] = var0;
      boolean var31 = !a6.tryGetValue(Integer.valueOf(var120), var2);
      var0 = var2[0];
      if (var31) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var120), var0);
      }

      short var268 = 119;
      var0.addItem(Integer.valueOf(var268), -15);
      var268 = (byte)121;
      var0.addItem(Integer.valueOf(var268), -15);
      var120 = (byte)103;
      var2[0] = var0;
      boolean var32 = !a6.tryGetValue(Integer.valueOf(var120), var2);
      var0 = var2[0];
      if (var32) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var120), var0);
      }

      var268 = (byte)103;
      var0.addItem(Integer.valueOf(var268), -10);
      var268 = (byte)101;
      var0.addItem(Integer.valueOf(var268), 10);
      var120 = (byte)66;
      var2[0] = var0;
      boolean var33 = !a6.tryGetValue(Integer.valueOf(var120), var2);
      var0 = var2[0];
      if (var33) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var120), var0);
      }

      var268 = (byte)65;
      var0.addItem(Integer.valueOf(var268), -30);
      var268 = (byte)85;
      var0.addItem(Integer.valueOf(var268), -10);
      var120 = (byte)98;
      var2[0] = var0;
      boolean var34 = !a6.tryGetValue(Integer.valueOf(var120), var2);
      var0 = var2[0];
      if (var34) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var120), var0);
      }

      var268 = (byte)117;
      var0.addItem(Integer.valueOf(var268), -20);
      var268 = (byte)121;
      var0.addItem(Integer.valueOf(var268), -20);
      var268 = (byte)108;
      var0.addItem(Integer.valueOf(var268), -10);
      var268 = (byte)118;
      var0.addItem(Integer.valueOf(var268), -20);
      var120 = (byte)76;
      var2[0] = var0;
      boolean var35 = !a6.tryGetValue(Integer.valueOf(var120), var2);
      var0 = var2[0];
      if (var35) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var120), var0);
      }

      var268 = 148;
      var0.addItem(Integer.valueOf(var268), -140);
      var268 = 146;
      var0.addItem(Integer.valueOf(var268), -140);
      short var280 = 87;
      var0.addItem(Integer.valueOf(var280), -80);
      var280 = (byte)89;
      var0.addItem(Integer.valueOf(var280), -120);
      var280 = (byte)121;
      var0.addItem(Integer.valueOf(var280), -30);
      var280 = (byte)84;
      var0.addItem(Integer.valueOf(var280), -90);
      var280 = (byte)86;
      var0.addItem(Integer.valueOf(var280), -110);
      var120 = (byte)81;
      var2[0] = var0;
      boolean var36 = !a6.tryGetValue(Integer.valueOf(var120), var2);
      var0 = var2[0];
      if (var36) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var120), var0);
      }

      var280 = (byte)85;
      var0.addItem(Integer.valueOf(var280), -10);
      var280 = (byte)46;
      var0.addItem(Integer.valueOf(var280), 20);
      var280 = (byte)44;
      var0.addItem(Integer.valueOf(var280), 20);
      var120 = (byte)44;
      var2[0] = var0;
      boolean var37 = !a6.tryGetValue(Integer.valueOf(var120), var2);
      var0 = var2[0];
      if (var37) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var120), var0);
      }

      var280 = 148;
      var0.addItem(Integer.valueOf(var280), -120);
      short var289 = 32;
      var0.addItem(Integer.valueOf(var289), -40);
      var289 = 146;
      var0.addItem(Integer.valueOf(var289), -120);
      var120 = 148;
      var2[0] = var0;
      boolean var38 = !a6.tryGetValue(Integer.valueOf(var120), var2);
      var0 = var2[0];
      if (var38) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var120), var0);
      }

      short var291 = 32;
      var0.addItem(Integer.valueOf(var291), -80);
      byte var128 = 109;
      var2[0] = var0;
      boolean var39 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var39) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var291 = (byte)117;
      var0.addItem(Integer.valueOf(var291), -20);
      var291 = (byte)121;
      var0.addItem(Integer.valueOf(var291), -30);
      var128 = 102;
      var2[0] = var0;
      boolean var40 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var40) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var291 = 148;
      var0.addItem(Integer.valueOf(var291), 30);
      short var295 = 111;
      var0.addItem(Integer.valueOf(var295), -20);
      var295 = 146;
      var0.addItem(Integer.valueOf(var295), 30);
      short var297 = 46;
      var0.addItem(Integer.valueOf(var297), -10);
      var297 = (byte)101;
      var0.addItem(Integer.valueOf(var297), -10);
      var297 = (byte)44;
      var0.addItem(Integer.valueOf(var297), -10);
      var128 = 74;
      var2[0] = var0;
      boolean var41 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var41) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var297 = (byte)65;
      var0.addItem(Integer.valueOf(var297), -20);
      var297 = (byte)117;
      var0.addItem(Integer.valueOf(var297), -20);
      var297 = (byte)46;
      var0.addItem(Integer.valueOf(var297), -20);
      var297 = (byte)44;
      var0.addItem(Integer.valueOf(var297), -20);
      var128 = 89;
      var2[0] = var0;
      boolean var42 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var42) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var297 = (byte)111;
      var0.addItem(Integer.valueOf(var297), -100);
      var297 = (byte)79;
      var0.addItem(Integer.valueOf(var297), -70);
      var297 = (byte)58;
      var0.addItem(Integer.valueOf(var297), -50);
      var297 = (byte)97;
      var0.addItem(Integer.valueOf(var297), -90);
      var297 = (byte)65;
      var0.addItem(Integer.valueOf(var297), -110);
      var297 = (byte)117;
      var0.addItem(Integer.valueOf(var297), -100);
      var297 = (byte)46;
      var0.addItem(Integer.valueOf(var297), -100);
      var297 = (byte)101;
      var0.addItem(Integer.valueOf(var297), -80);
      var297 = (byte)59;
      var0.addItem(Integer.valueOf(var297), -50);
      var297 = (byte)44;
      var0.addItem(Integer.valueOf(var297), -100);
      var128 = 84;
      var2[0] = var0;
      boolean var43 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var43) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var297 = (byte)111;
      var0.addItem(Integer.valueOf(var297), -80);
      var297 = (byte)79;
      var0.addItem(Integer.valueOf(var297), -40);
      var297 = (byte)58;
      var0.addItem(Integer.valueOf(var297), -40);
      var297 = (byte)119;
      var0.addItem(Integer.valueOf(var297), -60);
      var297 = (byte)114;
      var0.addItem(Integer.valueOf(var297), -80);
      var297 = (byte)44;
      var0.addItem(Integer.valueOf(var297), -80);
      var297 = (byte)59;
      var0.addItem(Integer.valueOf(var297), -40);
      var297 = (byte)45;
      var0.addItem(Integer.valueOf(var297), -120);
      var297 = (byte)65;
      var0.addItem(Integer.valueOf(var297), -90);
      var297 = (byte)97;
      var0.addItem(Integer.valueOf(var297), -80);
      var297 = (byte)117;
      var0.addItem(Integer.valueOf(var297), -90);
      var297 = (byte)121;
      var0.addItem(Integer.valueOf(var297), -60);
      var297 = (byte)46;
      var0.addItem(Integer.valueOf(var297), -80);
      var297 = (byte)101;
      var0.addItem(Integer.valueOf(var297), -60);
      var128 = 121;
      var2[0] = var0;
      boolean var44 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var44) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var297 = (byte)111;
      var0.addItem(Integer.valueOf(var297), -25);
      var297 = (byte)97;
      var0.addItem(Integer.valueOf(var297), -30);
      var297 = (byte)46;
      var0.addItem(Integer.valueOf(var297), -80);
      var297 = (byte)101;
      var0.addItem(Integer.valueOf(var297), -10);
      var297 = (byte)44;
      var0.addItem(Integer.valueOf(var297), -80);
      var128 = 46;
      var2[0] = var0;
      boolean var45 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var45) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var297 = 148;
      var0.addItem(Integer.valueOf(var297), -120);
      short var334 = 32;
      var0.addItem(Integer.valueOf(var334), -40);
      var334 = 146;
      var0.addItem(Integer.valueOf(var334), -120);
      var128 = 110;
      var2[0] = var0;
      boolean var46 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var46) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      byte var336 = 117;
      var0.addItem(Integer.valueOf(var336), -10);
      var336 = 121;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = 118;
      var0.addItem(Integer.valueOf(var336), -40);
      var128 = 120;
      var2[0] = var0;
      boolean var47 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var47) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var336 = 101;
      var0.addItem(Integer.valueOf(var336), -10);
      var128 = 101;
      var2[0] = var0;
      boolean var48 = !a6.tryGetValue(Integer.valueOf(var128), var2);
      var0 = var2[0];
      if (var48) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var128), var0);
      }

      var336 = 119;
      var0.addItem(Integer.valueOf(var336), -15);
      var336 = 121;
      var0.addItem(Integer.valueOf(var336), -15);
      var336 = 46;
      var0.addItem(Integer.valueOf(var336), 20);
      var336 = 120;
      var0.addItem(Integer.valueOf(var336), -15);
      var336 = 118;
      var0.addItem(Integer.valueOf(var336), -15);
      var336 = 44;
      var0.addItem(Integer.valueOf(var336), 10);
      l6 = new List<>();
      l6.addItem("Helvetica");
   }
}
