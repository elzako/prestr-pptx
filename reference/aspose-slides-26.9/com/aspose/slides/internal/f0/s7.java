package com.aspose.slides.internal.f0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class s7 extends n5 {
   private static final List<String> l6;
   private static final int[] k5 = new int[256];
   private final com.aspose.slides.internal.v0.l6 u3 = com.aspose.slides.internal.v0.l6.n5("WinAnsiEncoding");
   private static final Dictionary<Integer, Dictionary<Integer, Integer>> a6 = new Dictionary<>();
   private boolean u9 = false;

   public s7() {
      this(false);
   }

   public s7(boolean var1) {
      this.u9 = var1;
   }

   @Override
   public String n5() {
      return "WinAnsiEncoding";
   }

   @Override
   public String l6() {
      return "Helvetica-Oblique";
   }

   @Override
   public String k5() {
      return "Helvetica Oblique";
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
      return var1 * 523;
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
      k5[65] = 667;
      k5[198] = 1000;
      k5[193] = 667;
      k5[194] = 667;
      k5[196] = 667;
      k5[192] = 667;
      k5[197] = 667;
      k5[195] = 667;
      k5[66] = 667;
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
      k5[74] = 500;
      k5[75] = 667;
      k5[76] = 556;
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
      k5[38] = 667;
      k5[229] = 556;
      k5[94] = 469;
      k5[126] = 584;
      k5[42] = 389;
      k5[64] = 1015;
      k5[227] = 556;
      k5[98] = 556;
      k5[92] = 278;
      k5[124] = 260;
      k5[123] = 334;
      k5[125] = 334;
      k5[91] = 278;
      k5[93] = 278;
      k5[166] = 260;
      k5[149] = 350;
      k5[99] = 500;
      k5[231] = 500;
      k5[184] = 333;
      k5[162] = 556;
      k5[136] = 333;
      k5[58] = 278;
      k5[44] = 278;
      k5[169] = 737;
      k5[164] = 556;
      k5[100] = 556;
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
      k5[240] = 556;
      k5[33] = 278;
      k5[161] = 333;
      k5[102] = 278;
      k5[53] = 556;
      k5[131] = 556;
      k5[52] = 556;
      k5[103] = 556;
      k5[223] = 611;
      k5[96] = 333;
      k5[62] = 584;
      k5[171] = 556;
      k5[187] = 556;
      k5[139] = 333;
      k5[155] = 333;
      k5[104] = 556;
      k5[45] = 333;
      k5[105] = 222;
      k5[237] = 278;
      k5[238] = 278;
      k5[239] = 278;
      k5[236] = 278;
      k5[106] = 222;
      k5[107] = 500;
      k5[108] = 222;
      k5[60] = 584;
      k5[172] = 584;
      k5[109] = 833;
      k5[175] = 333;
      k5[181] = 556;
      k5[215] = 584;
      k5[110] = 556;
      k5[57] = 556;
      k5[241] = 556;
      k5[35] = 556;
      k5[111] = 556;
      k5[243] = 556;
      k5[244] = 556;
      k5[246] = 556;
      k5[156] = 944;
      k5[242] = 556;
      k5[49] = 556;
      k5[189] = 834;
      k5[188] = 834;
      k5[185] = 333;
      k5[170] = 370;
      k5[186] = 365;
      k5[248] = 611;
      k5[245] = 556;
      k5[112] = 556;
      k5[182] = 537;
      k5[40] = 333;
      k5[41] = 333;
      k5[37] = 889;
      k5[46] = 278;
      k5[183] = 278;
      k5[137] = 1000;
      k5[43] = 584;
      k5[177] = 584;
      k5[113] = 556;
      k5[63] = 556;
      k5[191] = 611;
      k5[34] = 355;
      k5[132] = 333;
      k5[147] = 333;
      k5[148] = 333;
      k5[145] = 222;
      k5[146] = 222;
      k5[130] = 222;
      k5[39] = 191;
      k5[114] = 333;
      k5[174] = 737;
      k5[115] = 500;
      k5[154] = 500;
      k5[167] = 556;
      k5[59] = 278;
      k5[55] = 556;
      k5[54] = 556;
      k5[47] = 278;
      k5[32] = 278;
      k5[163] = 556;
      k5[116] = 278;
      k5[254] = 556;
      k5[51] = 556;
      k5[190] = 834;
      k5[179] = 333;
      k5[152] = 333;
      k5[153] = 1000;
      k5[50] = 556;
      k5[178] = 333;
      k5[117] = 556;
      k5[250] = 556;
      k5[251] = 556;
      k5[252] = 556;
      k5[249] = 556;
      k5[95] = 556;
      k5[118] = 500;
      k5[119] = 722;
      k5[120] = 500;
      k5[121] = 500;
      k5[253] = 500;
      k5[255] = 500;
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
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -20);
      var1 = (byte)79;
      var2[0] = var0;
      boolean var5 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var5) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)87;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)89;
      var0.addItem(Integer.valueOf(var4), -70);
      var4 = (byte)84;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)86;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)88;
      var0.addItem(Integer.valueOf(var4), -60);
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
      var0.addItem(Integer.valueOf(var4), -30);
      var1 = (byte)87;
      var2[0] = var0;
      boolean var7 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var7) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)45;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)79;
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)117;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -80);
      var1 = (byte)99;
      var2[0] = var0;
      boolean var8 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var8) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)107;
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -15);
      var1 = (byte)112;
      var2[0] = var0;
      boolean var9 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var9) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -35);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -35);
      var1 = (byte)80;
      var2[0] = var0;
      boolean var10 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var10) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -120);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -180);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -180);
      var1 = (byte)86;
      var2[0] = var0;
      boolean var11 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var11) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)45;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)79;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)58;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -70);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)117;
      var0.addItem(Integer.valueOf(var4), -70);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -125);
      var4 = (byte)71;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)59;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -125);
      var1 = (byte)118;
      var2[0] = var0;
      boolean var12 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var12) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -25);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -25);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -80);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -25);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -80);
      var1 = (byte)59;
      var2[0] = var0;
      boolean var13 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var13) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)32;
      var0.addItem(Integer.valueOf(var4), -50);
      var1 = (byte)32;
      var2[0] = var0;
      boolean var14 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var14) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)87;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = 147;
      var0.addItem(Integer.valueOf(var4), -30);
      short var192 = 89;
      var0.addItem(Integer.valueOf(var192), -90);
      var192 = (byte)84;
      var0.addItem(Integer.valueOf(var192), -50);
      var192 = 145;
      var0.addItem(Integer.valueOf(var192), -60);
      short var195 = 86;
      var0.addItem(Integer.valueOf(var195), -50);
      var1 = (byte)97;
      var2[0] = var0;
      boolean var15 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var15) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)119;
      var0.addItem(Integer.valueOf(var195), -20);
      var195 = (byte)121;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)118;
      var0.addItem(Integer.valueOf(var195), -20);
      var1 = (byte)65;
      var2[0] = var0;
      boolean var16 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var16) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)79;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)119;
      var0.addItem(Integer.valueOf(var195), -40);
      var195 = (byte)87;
      var0.addItem(Integer.valueOf(var195), -50);
      var195 = (byte)67;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)81;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)71;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)86;
      var0.addItem(Integer.valueOf(var195), -70);
      var195 = (byte)118;
      var0.addItem(Integer.valueOf(var195), -40);
      var195 = (byte)85;
      var0.addItem(Integer.valueOf(var195), -50);
      var195 = (byte)117;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)89;
      var0.addItem(Integer.valueOf(var195), -100);
      var195 = (byte)84;
      var0.addItem(Integer.valueOf(var195), -120);
      var195 = (byte)121;
      var0.addItem(Integer.valueOf(var195), -40);
      var1 = (byte)70;
      var2[0] = var0;
      boolean var17 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var17) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)111;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)114;
      var0.addItem(Integer.valueOf(var195), -45);
      var195 = (byte)97;
      var0.addItem(Integer.valueOf(var195), -50);
      var195 = (byte)65;
      var0.addItem(Integer.valueOf(var195), -80);
      var195 = (byte)46;
      var0.addItem(Integer.valueOf(var195), -150);
      var195 = (byte)101;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)44;
      var0.addItem(Integer.valueOf(var195), -150);
      var1 = (byte)85;
      var2[0] = var0;
      boolean var18 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var18) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)65;
      var0.addItem(Integer.valueOf(var195), -40);
      var195 = (byte)46;
      var0.addItem(Integer.valueOf(var195), -40);
      var195 = (byte)44;
      var0.addItem(Integer.valueOf(var195), -40);
      var1 = (byte)115;
      var2[0] = var0;
      boolean var19 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var19) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)119;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)46;
      var0.addItem(Integer.valueOf(var195), -15);
      var195 = (byte)44;
      var0.addItem(Integer.valueOf(var195), -15);
      var1 = (byte)122;
      var2[0] = var0;
      boolean var20 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var20) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)111;
      var0.addItem(Integer.valueOf(var195), -15);
      var195 = (byte)101;
      var0.addItem(Integer.valueOf(var195), -15);
      var1 = (byte)83;
      var2[0] = var0;
      boolean var21 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var21) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)46;
      var0.addItem(Integer.valueOf(var195), -20);
      var195 = (byte)44;
      var0.addItem(Integer.valueOf(var195), -20);
      var1 = (byte)111;
      var2[0] = var0;
      boolean var22 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var22) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)119;
      var0.addItem(Integer.valueOf(var195), -15);
      var195 = (byte)121;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)46;
      var0.addItem(Integer.valueOf(var195), -40);
      var195 = (byte)120;
      var0.addItem(Integer.valueOf(var195), -30);
      var195 = (byte)118;
      var0.addItem(Integer.valueOf(var195), -15);
      var195 = (byte)44;
      var0.addItem(Integer.valueOf(var195), -40);
      var1 = (byte)68;
      var2[0] = var0;
      boolean var23 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var23) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)65;
      var0.addItem(Integer.valueOf(var195), -40);
      var195 = (byte)87;
      var0.addItem(Integer.valueOf(var195), -40);
      var195 = (byte)89;
      var0.addItem(Integer.valueOf(var195), -90);
      var195 = (byte)46;
      var0.addItem(Integer.valueOf(var195), -70);
      var195 = (byte)86;
      var0.addItem(Integer.valueOf(var195), -70);
      var195 = (byte)44;
      var0.addItem(Integer.valueOf(var195), -70);
      var1 = 146;
      var2[0] = var0;
      boolean var24 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var24) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var195 = (byte)100;
      var0.addItem(Integer.valueOf(var195), -50);
      var195 = (byte)32;
      var0.addItem(Integer.valueOf(var195), -70);
      var195 = 146;
      var0.addItem(Integer.valueOf(var195), -57);
      short var244 = 114;
      var0.addItem(Integer.valueOf(var244), -50);
      var244 = (byte)115;
      var0.addItem(Integer.valueOf(var244), -50);
      short var116 = 82;
      var2[0] = var0;
      boolean var25 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var25) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var244 = (byte)79;
      var0.addItem(Integer.valueOf(var244), -20);
      var244 = (byte)87;
      var0.addItem(Integer.valueOf(var244), -30);
      var244 = (byte)85;
      var0.addItem(Integer.valueOf(var244), -40);
      var244 = (byte)89;
      var0.addItem(Integer.valueOf(var244), -50);
      var244 = (byte)84;
      var0.addItem(Integer.valueOf(var244), -30);
      var244 = (byte)86;
      var0.addItem(Integer.valueOf(var244), -50);
      var116 = (byte)75;
      var2[0] = var0;
      boolean var26 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var26) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var244 = (byte)111;
      var0.addItem(Integer.valueOf(var244), -40);
      var244 = (byte)79;
      var0.addItem(Integer.valueOf(var244), -50);
      var244 = (byte)117;
      var0.addItem(Integer.valueOf(var244), -30);
      var244 = (byte)121;
      var0.addItem(Integer.valueOf(var244), -50);
      var244 = (byte)101;
      var0.addItem(Integer.valueOf(var244), -40);
      var116 = (byte)119;
      var2[0] = var0;
      boolean var27 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var27) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var244 = (byte)111;
      var0.addItem(Integer.valueOf(var244), -10);
      var244 = (byte)97;
      var0.addItem(Integer.valueOf(var244), -15);
      var244 = (byte)46;
      var0.addItem(Integer.valueOf(var244), -60);
      var244 = (byte)101;
      var0.addItem(Integer.valueOf(var244), -10);
      var244 = (byte)44;
      var0.addItem(Integer.valueOf(var244), -60);
      var116 = (byte)58;
      var2[0] = var0;
      boolean var28 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var28) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var244 = (byte)32;
      var0.addItem(Integer.valueOf(var244), -50);
      var116 = (byte)114;
      var2[0] = var0;
      boolean var29 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var29) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var244 = (byte)107;
      var0.addItem(Integer.valueOf(var244), 15);
      var244 = (byte)58;
      var0.addItem(Integer.valueOf(var244), 30);
      var244 = (byte)112;
      var0.addItem(Integer.valueOf(var244), 30);
      var244 = (byte)108;
      var0.addItem(Integer.valueOf(var244), 15);
      var244 = (byte)118;
      var0.addItem(Integer.valueOf(var244), 30);
      var244 = (byte)44;
      var0.addItem(Integer.valueOf(var244), -50);
      var244 = (byte)59;
      var0.addItem(Integer.valueOf(var244), 30);
      var244 = (byte)105;
      var0.addItem(Integer.valueOf(var244), 15);
      var244 = (byte)109;
      var0.addItem(Integer.valueOf(var244), 25);
      var244 = (byte)97;
      var0.addItem(Integer.valueOf(var244), -10);
      var244 = (byte)117;
      var0.addItem(Integer.valueOf(var244), 15);
      var244 = (byte)116;
      var0.addItem(Integer.valueOf(var244), 40);
      var244 = (byte)121;
      var0.addItem(Integer.valueOf(var244), 30);
      var244 = (byte)46;
      var0.addItem(Integer.valueOf(var244), -50);
      var244 = (byte)110;
      var0.addItem(Integer.valueOf(var244), 25);
      var116 = (byte)67;
      var2[0] = var0;
      boolean var30 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var30) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var244 = (byte)46;
      var0.addItem(Integer.valueOf(var244), -30);
      var244 = (byte)44;
      var0.addItem(Integer.valueOf(var244), -30);
      var116 = 145;
      var2[0] = var0;
      boolean var31 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var31) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var244 = 145;
      var0.addItem(Integer.valueOf(var244), -57);
      short var123 = 103;
      var2[0] = var0;
      boolean var32 = !a6.tryGetValue(Integer.valueOf(var123), var2);
      var0 = var2[0];
      if (var32) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var123), var0);
      }

      short var281 = 114;
      var0.addItem(Integer.valueOf(var281), -10);
      var123 = (byte)66;
      var2[0] = var0;
      boolean var33 = !a6.tryGetValue(Integer.valueOf(var123), var2);
      var0 = var2[0];
      if (var33) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var123), var0);
      }

      var281 = (byte)85;
      var0.addItem(Integer.valueOf(var281), -10);
      var281 = (byte)46;
      var0.addItem(Integer.valueOf(var281), -20);
      var281 = (byte)44;
      var0.addItem(Integer.valueOf(var281), -20);
      var123 = (byte)81;
      var2[0] = var0;
      boolean var34 = !a6.tryGetValue(Integer.valueOf(var123), var2);
      var0 = var2[0];
      if (var34) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var123), var0);
      }

      var281 = (byte)85;
      var0.addItem(Integer.valueOf(var281), -10);
      var123 = (byte)76;
      var2[0] = var0;
      boolean var35 = !a6.tryGetValue(Integer.valueOf(var123), var2);
      var0 = var2[0];
      if (var35) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var123), var0);
      }

      var281 = 148;
      var0.addItem(Integer.valueOf(var281), -140);
      var281 = 146;
      var0.addItem(Integer.valueOf(var281), -160);
      short var288 = 87;
      var0.addItem(Integer.valueOf(var288), -70);
      var288 = (byte)89;
      var0.addItem(Integer.valueOf(var288), -140);
      var288 = (byte)121;
      var0.addItem(Integer.valueOf(var288), -30);
      var288 = (byte)84;
      var0.addItem(Integer.valueOf(var288), -110);
      var288 = (byte)86;
      var0.addItem(Integer.valueOf(var288), -110);
      var123 = (byte)98;
      var2[0] = var0;
      boolean var36 = !a6.tryGetValue(Integer.valueOf(var123), var2);
      var0 = var2[0];
      if (var36) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var123), var0);
      }

      var288 = (byte)117;
      var0.addItem(Integer.valueOf(var288), -20);
      var288 = (byte)121;
      var0.addItem(Integer.valueOf(var288), -20);
      var288 = (byte)46;
      var0.addItem(Integer.valueOf(var288), -40);
      var288 = (byte)108;
      var0.addItem(Integer.valueOf(var288), -20);
      var288 = (byte)98;
      var0.addItem(Integer.valueOf(var288), -10);
      var288 = (byte)118;
      var0.addItem(Integer.valueOf(var288), -20);
      var288 = (byte)44;
      var0.addItem(Integer.valueOf(var288), -40);
      var123 = (byte)44;
      var2[0] = var0;
      boolean var37 = !a6.tryGetValue(Integer.valueOf(var123), var2);
      var0 = var2[0];
      if (var37) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var123), var0);
      }

      var288 = 148;
      var0.addItem(Integer.valueOf(var288), -100);
      var288 = 146;
      var0.addItem(Integer.valueOf(var288), -100);
      var123 = 148;
      var2[0] = var0;
      boolean var38 = !a6.tryGetValue(Integer.valueOf(var123), var2);
      var0 = var2[0];
      if (var38) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var123), var0);
      }

      short var302 = 32;
      var0.addItem(Integer.valueOf(var302), -40);
      short var130 = 109;
      var2[0] = var0;
      boolean var39 = !a6.tryGetValue(Integer.valueOf(var130), var2);
      var0 = var2[0];
      if (var39) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var130), var0);
      }

      var302 = (byte)117;
      var0.addItem(Integer.valueOf(var302), -10);
      var302 = (byte)121;
      var0.addItem(Integer.valueOf(var302), -15);
      var130 = 248;
      var2[0] = var0;
      boolean var40 = !a6.tryGetValue(Integer.valueOf(var130), var2);
      var0 = var2[0];
      if (var40) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var130), var0);
      }

      var302 = (byte)107;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)104;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)99;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)112;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)113;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)118;
      var0.addItem(Integer.valueOf(var302), -70);
      var302 = (byte)105;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)97;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)117;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)116;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)106;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)115;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)122;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)100;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)111;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)119;
      var0.addItem(Integer.valueOf(var302), -70);
      var302 = (byte)114;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)103;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)108;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)98;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)44;
      var0.addItem(Integer.valueOf(var302), -95);
      var302 = (byte)109;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)102;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)121;
      var0.addItem(Integer.valueOf(var302), -70);
      var302 = (byte)46;
      var0.addItem(Integer.valueOf(var302), -95);
      var302 = (byte)110;
      var0.addItem(Integer.valueOf(var302), -55);
      var302 = (byte)120;
      var0.addItem(Integer.valueOf(var302), -85);
      var302 = (byte)101;
      var0.addItem(Integer.valueOf(var302), -55);
      byte var132 = 102;
      var2[0] = var0;
      boolean var41 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var41) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      var302 = 148;
      var0.addItem(Integer.valueOf(var302), 60);
      short var334 = 111;
      var0.addItem(Integer.valueOf(var334), -30);
      var334 = 146;
      var0.addItem(Integer.valueOf(var334), 50);
      short var336 = 97;
      var0.addItem(Integer.valueOf(var336), -30);
      var336 = (byte)46;
      var0.addItem(Integer.valueOf(var336), -30);
      var336 = (byte)101;
      var0.addItem(Integer.valueOf(var336), -30);
      var336 = (byte)44;
      var0.addItem(Integer.valueOf(var336), -30);
      var132 = 74;
      var2[0] = var0;
      boolean var42 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var42) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      var336 = (byte)97;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)65;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)117;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)46;
      var0.addItem(Integer.valueOf(var336), -30);
      var336 = (byte)44;
      var0.addItem(Integer.valueOf(var336), -30);
      var132 = 89;
      var2[0] = var0;
      boolean var43 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var43) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      var336 = (byte)111;
      var0.addItem(Integer.valueOf(var336), -140);
      var336 = (byte)45;
      var0.addItem(Integer.valueOf(var336), -140);
      var336 = (byte)105;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)79;
      var0.addItem(Integer.valueOf(var336), -85);
      var336 = (byte)58;
      var0.addItem(Integer.valueOf(var336), -60);
      var336 = (byte)97;
      var0.addItem(Integer.valueOf(var336), -140);
      var336 = (byte)65;
      var0.addItem(Integer.valueOf(var336), -110);
      var336 = (byte)117;
      var0.addItem(Integer.valueOf(var336), -110);
      var336 = (byte)46;
      var0.addItem(Integer.valueOf(var336), -140);
      var336 = (byte)101;
      var0.addItem(Integer.valueOf(var336), -140);
      var336 = (byte)59;
      var0.addItem(Integer.valueOf(var336), -60);
      var336 = (byte)44;
      var0.addItem(Integer.valueOf(var336), -140);
      var132 = 121;
      var2[0] = var0;
      boolean var44 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var44) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      var336 = (byte)111;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)97;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)46;
      var0.addItem(Integer.valueOf(var336), -100);
      var336 = (byte)101;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)44;
      var0.addItem(Integer.valueOf(var336), -100);
      var132 = 84;
      var2[0] = var0;
      boolean var45 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var45) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      var336 = (byte)111;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)79;
      var0.addItem(Integer.valueOf(var336), -40);
      var336 = (byte)58;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)119;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)114;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)44;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)59;
      var0.addItem(Integer.valueOf(var336), -20);
      var336 = (byte)45;
      var0.addItem(Integer.valueOf(var336), -140);
      var336 = (byte)65;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)97;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)117;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)121;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)46;
      var0.addItem(Integer.valueOf(var336), -120);
      var336 = (byte)101;
      var0.addItem(Integer.valueOf(var336), -120);
      var132 = 46;
      var2[0] = var0;
      boolean var46 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var46) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      var336 = 148;
      var0.addItem(Integer.valueOf(var336), -100);
      short var377 = 32;
      var0.addItem(Integer.valueOf(var377), -60);
      var377 = 146;
      var0.addItem(Integer.valueOf(var377), -100);
      var132 = 110;
      var2[0] = var0;
      boolean var47 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var47) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      byte var379 = 117;
      var0.addItem(Integer.valueOf(var379), -10);
      var379 = 121;
      var0.addItem(Integer.valueOf(var379), -15);
      var379 = 118;
      var0.addItem(Integer.valueOf(var379), -20);
      var132 = 120;
      var2[0] = var0;
      boolean var48 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var48) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      var379 = 101;
      var0.addItem(Integer.valueOf(var379), -30);
      var132 = 101;
      var2[0] = var0;
      boolean var49 = !a6.tryGetValue(Integer.valueOf(var132), var2);
      var0 = var2[0];
      if (var49) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var132), var0);
      }

      var379 = 119;
      var0.addItem(Integer.valueOf(var379), -20);
      var379 = 121;
      var0.addItem(Integer.valueOf(var379), -20);
      var379 = 46;
      var0.addItem(Integer.valueOf(var379), -15);
      var379 = 120;
      var0.addItem(Integer.valueOf(var379), -30);
      var379 = 118;
      var0.addItem(Integer.valueOf(var379), -30);
      var379 = 44;
      var0.addItem(Integer.valueOf(var379), -15);
      l6 = new List<>();
      l6.addItem("Helvetica");
   }
}
