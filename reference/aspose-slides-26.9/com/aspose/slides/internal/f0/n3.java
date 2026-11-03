package com.aspose.slides.internal.f0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class n3 extends n5 {
   private static final List<String> l6;
   private static final int[] k5 = new int[256];
   private final com.aspose.slides.internal.v0.l6 u3 = com.aspose.slides.internal.v0.l6.n5("WinAnsiEncoding");
   private static final Dictionary<Integer, Dictionary<Integer, Integer>> a6 = new Dictionary<>();
   private boolean u9 = false;

   public n3() {
      this(false);
   }

   public n3(boolean var1) {
      this.u9 = var1;
   }

   @Override
   public String n5() {
      return "WinAnsiEncoding";
   }

   @Override
   public String l6() {
      return "Times-BoldItalic";
   }

   @Override
   public String k5() {
      return "Times Bold Italic";
   }

   @Override
   public int l6(int var1) {
      return var1 * 699;
   }

   @Override
   public int k5(int var1) {
      return var1 * 669;
   }

   @Override
   public int u3(int var1) {
      return var1 * -205;
   }

   @Override
   public int a6(int var1) {
      return var1 * 462;
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
      k5[198] = 944;
      k5[193] = 667;
      k5[194] = 667;
      k5[196] = 667;
      k5[192] = 667;
      k5[197] = 667;
      k5[195] = 667;
      k5[66] = 667;
      k5[67] = 667;
      k5[199] = 667;
      k5[68] = 722;
      k5[69] = 667;
      k5[201] = 667;
      k5[202] = 667;
      k5[203] = 667;
      k5[200] = 667;
      k5[208] = 722;
      k5[128] = 500;
      k5[70] = 667;
      k5[71] = 722;
      k5[72] = 778;
      k5[73] = 389;
      k5[205] = 389;
      k5[206] = 389;
      k5[207] = 389;
      k5[204] = 389;
      k5[74] = 500;
      k5[75] = 667;
      k5[76] = 611;
      k5[77] = 889;
      k5[78] = 722;
      k5[209] = 722;
      k5[79] = 722;
      k5[140] = 944;
      k5[211] = 722;
      k5[212] = 722;
      k5[214] = 722;
      k5[210] = 722;
      k5[216] = 722;
      k5[213] = 722;
      k5[80] = 611;
      k5[81] = 722;
      k5[82] = 667;
      k5[83] = 556;
      k5[138] = 556;
      k5[84] = 611;
      k5[222] = 611;
      k5[85] = 722;
      k5[218] = 722;
      k5[219] = 722;
      k5[220] = 722;
      k5[217] = 722;
      k5[86] = 667;
      k5[87] = 889;
      k5[88] = 667;
      k5[89] = 611;
      k5[221] = 611;
      k5[159] = 611;
      k5[90] = 611;
      k5[142] = 611;
      k5[97] = 500;
      k5[225] = 500;
      k5[226] = 500;
      k5[180] = 333;
      k5[228] = 500;
      k5[230] = 722;
      k5[224] = 500;
      k5[38] = 778;
      k5[229] = 500;
      k5[94] = 570;
      k5[126] = 570;
      k5[42] = 500;
      k5[64] = 832;
      k5[227] = 500;
      k5[98] = 500;
      k5[92] = 278;
      k5[124] = 220;
      k5[123] = 348;
      k5[125] = 348;
      k5[91] = 333;
      k5[93] = 333;
      k5[166] = 220;
      k5[149] = 350;
      k5[99] = 444;
      k5[231] = 444;
      k5[184] = 333;
      k5[162] = 500;
      k5[136] = 333;
      k5[58] = 333;
      k5[44] = 250;
      k5[169] = 747;
      k5[164] = 500;
      k5[100] = 500;
      k5[134] = 500;
      k5[135] = 500;
      k5[176] = 400;
      k5[168] = 333;
      k5[247] = 570;
      k5[36] = 500;
      k5[101] = 444;
      k5[233] = 444;
      k5[234] = 444;
      k5[235] = 444;
      k5[232] = 444;
      k5[56] = 500;
      k5[133] = 1000;
      k5[151] = 1000;
      k5[150] = 500;
      k5[61] = 570;
      k5[240] = 500;
      k5[33] = 389;
      k5[161] = 389;
      k5[102] = 333;
      k5[53] = 500;
      k5[131] = 500;
      k5[52] = 500;
      k5[103] = 500;
      k5[223] = 500;
      k5[96] = 333;
      k5[62] = 570;
      k5[171] = 500;
      k5[187] = 500;
      k5[139] = 333;
      k5[155] = 333;
      k5[104] = 556;
      k5[45] = 333;
      k5[105] = 278;
      k5[237] = 278;
      k5[238] = 278;
      k5[239] = 278;
      k5[236] = 278;
      k5[106] = 278;
      k5[107] = 500;
      k5[108] = 278;
      k5[60] = 570;
      k5[172] = 606;
      k5[109] = 778;
      k5[175] = 333;
      k5[181] = 576;
      k5[215] = 570;
      k5[110] = 556;
      k5[57] = 500;
      k5[241] = 556;
      k5[35] = 500;
      k5[111] = 500;
      k5[243] = 500;
      k5[244] = 500;
      k5[246] = 500;
      k5[156] = 722;
      k5[242] = 500;
      k5[49] = 500;
      k5[189] = 750;
      k5[188] = 750;
      k5[185] = 300;
      k5[170] = 266;
      k5[186] = 300;
      k5[248] = 500;
      k5[245] = 500;
      k5[112] = 500;
      k5[182] = 500;
      k5[40] = 333;
      k5[41] = 333;
      k5[37] = 833;
      k5[46] = 250;
      k5[183] = 250;
      k5[137] = 1000;
      k5[43] = 570;
      k5[177] = 570;
      k5[113] = 500;
      k5[63] = 500;
      k5[191] = 500;
      k5[34] = 555;
      k5[132] = 500;
      k5[147] = 500;
      k5[148] = 500;
      k5[145] = 333;
      k5[146] = 333;
      k5[130] = 333;
      k5[39] = 278;
      k5[114] = 389;
      k5[174] = 747;
      k5[115] = 389;
      k5[154] = 389;
      k5[167] = 500;
      k5[59] = 333;
      k5[55] = 500;
      k5[54] = 500;
      k5[47] = 278;
      k5[32] = 250;
      k5[163] = 500;
      k5[116] = 278;
      k5[254] = 500;
      k5[51] = 500;
      k5[190] = 750;
      k5[179] = 300;
      k5[152] = 333;
      k5[153] = 1000;
      k5[50] = 500;
      k5[178] = 300;
      k5[117] = 556;
      k5[250] = 556;
      k5[251] = 556;
      k5[252] = 556;
      k5[249] = 556;
      k5[95] = 500;
      k5[118] = 444;
      k5[119] = 667;
      k5[120] = 500;
      k5[121] = 444;
      k5[253] = 444;
      k5[255] = 444;
      k5[165] = 500;
      k5[122] = 389;
      k5[158] = 389;
      k5[48] = 500;
      Dictionary var0 = null;
      short var1 = 79;
      Dictionary[] var2 = new Dictionary[]{var0};
      boolean var3 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var3) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      short var4 = 65;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)87;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)89;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)84;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), 0);
      var4 = (byte)86;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)88;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), 0);
      var1 = (byte)107;
      var2[0] = var0;
      boolean var5 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var5) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -10);
      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), 0);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -30);
      var1 = (byte)112;
      var2[0] = var0;
      boolean var6 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var6) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), 0);
      var1 = (byte)80;
      var2[0] = var0;
      boolean var7 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var7) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -55);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -85);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -129);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -50);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -129);
      var1 = (byte)86;
      var2[0] = var0;
      boolean var8 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var8) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -111);
      var4 = (byte)79;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = (byte)58;
      var0.addItem(Integer.valueOf(var4), -74);
      var4 = (byte)71;
      var0.addItem(Integer.valueOf(var4), -10);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -129);
      var4 = (byte)59;
      var0.addItem(Integer.valueOf(var4), -74);
      var4 = (byte)45;
      var0.addItem(Integer.valueOf(var4), -70);
      var4 = (byte)105;
      var0.addItem(Integer.valueOf(var4), -55);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -85);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -111);
      var4 = (byte)117;
      var0.addItem(Integer.valueOf(var4), -55);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -129);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -111);
      var1 = (byte)118;
      var2[0] = var0;
      boolean var9 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var9) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -15);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), 0);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -37);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -15);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -37);
      var1 = (byte)32;
      var2[0] = var0;
      boolean var10 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var10) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -37);
      var4 = (byte)87;
      var0.addItem(Integer.valueOf(var4), -70);
      var4 = 147;
      var0.addItem(Integer.valueOf(var4), 0);
      short var188 = 89;
      var0.addItem(Integer.valueOf(var188), -70);
      var188 = (byte)84;
      var0.addItem(Integer.valueOf(var188), 0);
      var188 = 145;
      var0.addItem(Integer.valueOf(var188), 0);
      short var191 = 86;
      var0.addItem(Integer.valueOf(var191), -70);
      var1 = (byte)97;
      var2[0] = var0;
      boolean var11 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var11) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)119;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)116;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)121;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)112;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)103;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)98;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)118;
      var0.addItem(Integer.valueOf(var191), 0);
      var1 = (byte)70;
      var2[0] = var0;
      boolean var12 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var12) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)111;
      var0.addItem(Integer.valueOf(var191), -70);
      var191 = (byte)105;
      var0.addItem(Integer.valueOf(var191), -40);
      var191 = (byte)114;
      var0.addItem(Integer.valueOf(var191), -50);
      var191 = (byte)97;
      var0.addItem(Integer.valueOf(var191), -95);
      var191 = (byte)65;
      var0.addItem(Integer.valueOf(var191), -100);
      var191 = (byte)46;
      var0.addItem(Integer.valueOf(var191), -129);
      var191 = (byte)101;
      var0.addItem(Integer.valueOf(var191), -100);
      var191 = (byte)44;
      var0.addItem(Integer.valueOf(var191), -129);
      var1 = (byte)85;
      var2[0] = var0;
      boolean var13 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var13) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)65;
      var0.addItem(Integer.valueOf(var191), -45);
      var191 = (byte)46;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)44;
      var0.addItem(Integer.valueOf(var191), 0);
      var1 = (byte)100;
      var2[0] = var0;
      boolean var14 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var14) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)100;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)119;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)121;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)46;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)118;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)44;
      var0.addItem(Integer.valueOf(var191), 0);
      var1 = (byte)83;
      var2[0] = var0;
      boolean var15 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var15) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)46;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)44;
      var0.addItem(Integer.valueOf(var191), 0);
      var1 = (byte)122;
      var2[0] = var0;
      boolean var16 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var16) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)111;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)101;
      var0.addItem(Integer.valueOf(var191), 0);
      var1 = (byte)68;
      var2[0] = var0;
      boolean var17 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var17) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)65;
      var0.addItem(Integer.valueOf(var191), -25);
      var191 = (byte)87;
      var0.addItem(Integer.valueOf(var191), -40);
      var191 = (byte)89;
      var0.addItem(Integer.valueOf(var191), -50);
      var191 = (byte)46;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)86;
      var0.addItem(Integer.valueOf(var191), -50);
      var191 = (byte)44;
      var0.addItem(Integer.valueOf(var191), 0);
      var1 = 146;
      var2[0] = var0;
      boolean var18 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var18) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = 148;
      var0.addItem(Integer.valueOf(var191), 0);
      short var227 = 100;
      var0.addItem(Integer.valueOf(var227), -15);
      var227 = (byte)32;
      var0.addItem(Integer.valueOf(var227), -74);
      var227 = 146;
      var0.addItem(Integer.valueOf(var227), -74);
      short var230 = 114;
      var0.addItem(Integer.valueOf(var230), -15);
      var230 = (byte)116;
      var0.addItem(Integer.valueOf(var230), -37);
      var230 = (byte)108;
      var0.addItem(Integer.valueOf(var230), 0);
      var230 = (byte)115;
      var0.addItem(Integer.valueOf(var230), -74);
      var230 = (byte)118;
      var0.addItem(Integer.valueOf(var230), -15);
      short var116 = 58;
      var2[0] = var0;
      boolean var19 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var19) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var230 = (byte)32;
      var0.addItem(Integer.valueOf(var230), 0);
      var116 = (byte)119;
      var2[0] = var0;
      boolean var20 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var20) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var230 = (byte)111;
      var0.addItem(Integer.valueOf(var230), -15);
      var230 = (byte)97;
      var0.addItem(Integer.valueOf(var230), -10);
      var230 = (byte)104;
      var0.addItem(Integer.valueOf(var230), 0);
      var230 = (byte)46;
      var0.addItem(Integer.valueOf(var230), -37);
      var230 = (byte)101;
      var0.addItem(Integer.valueOf(var230), -10);
      var230 = (byte)44;
      var0.addItem(Integer.valueOf(var230), -37);
      var116 = (byte)75;
      var2[0] = var0;
      boolean var21 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var21) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var230 = (byte)111;
      var0.addItem(Integer.valueOf(var230), -25);
      var230 = (byte)79;
      var0.addItem(Integer.valueOf(var230), -30);
      var230 = (byte)117;
      var0.addItem(Integer.valueOf(var230), -20);
      var230 = (byte)121;
      var0.addItem(Integer.valueOf(var230), -20);
      var230 = (byte)101;
      var0.addItem(Integer.valueOf(var230), -25);
      var116 = (byte)82;
      var2[0] = var0;
      boolean var22 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var22) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var230 = (byte)79;
      var0.addItem(Integer.valueOf(var230), -40);
      var230 = (byte)87;
      var0.addItem(Integer.valueOf(var230), -18);
      var230 = (byte)85;
      var0.addItem(Integer.valueOf(var230), -40);
      var230 = (byte)89;
      var0.addItem(Integer.valueOf(var230), -18);
      var230 = (byte)84;
      var0.addItem(Integer.valueOf(var230), -30);
      var230 = (byte)86;
      var0.addItem(Integer.valueOf(var230), -18);
      var116 = 145;
      var2[0] = var0;
      boolean var23 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var23) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var230 = (byte)65;
      var0.addItem(Integer.valueOf(var230), 0);
      var230 = 145;
      var0.addItem(Integer.valueOf(var230), -74);
      short var121 = 103;
      var2[0] = var0;
      boolean var24 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var24) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      short var255 = 111;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)105;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)114;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)97;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)121;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)46;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)103;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)101;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)44;
      var0.addItem(Integer.valueOf(var255), 0);
      var121 = (byte)66;
      var2[0] = var0;
      boolean var25 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var25) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var255 = (byte)65;
      var0.addItem(Integer.valueOf(var255), -25);
      var255 = (byte)85;
      var0.addItem(Integer.valueOf(var255), -10);
      var255 = (byte)46;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)44;
      var0.addItem(Integer.valueOf(var255), 0);
      var121 = (byte)98;
      var2[0] = var0;
      boolean var26 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var26) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var255 = (byte)117;
      var0.addItem(Integer.valueOf(var255), -20);
      var255 = (byte)121;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)46;
      var0.addItem(Integer.valueOf(var255), -40);
      var255 = (byte)108;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)98;
      var0.addItem(Integer.valueOf(var255), -10);
      var255 = (byte)118;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)44;
      var0.addItem(Integer.valueOf(var255), 0);
      var121 = (byte)81;
      var2[0] = var0;
      boolean var27 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var27) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var255 = (byte)85;
      var0.addItem(Integer.valueOf(var255), -10);
      var255 = (byte)46;
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)44;
      var0.addItem(Integer.valueOf(var255), 0);
      var121 = (byte)44;
      var2[0] = var0;
      boolean var28 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var28) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var255 = 148;
      var0.addItem(Integer.valueOf(var255), -95);
      short var279 = 32;
      var0.addItem(Integer.valueOf(var279), 0);
      var279 = 146;
      var0.addItem(Integer.valueOf(var279), -95);
      var121 = (byte)102;
      var2[0] = var0;
      boolean var29 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var29) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var279 = 148;
      var0.addItem(Integer.valueOf(var279), 0);
      short var282 = 111;
      var0.addItem(Integer.valueOf(var282), -10);
      var282 = (byte)105;
      var0.addItem(Integer.valueOf(var282), 0);
      var282 = 146;
      var0.addItem(Integer.valueOf(var282), 55);
      short var285 = 97;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)102;
      var0.addItem(Integer.valueOf(var285), -18);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), -10);
      var285 = (byte)108;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), -10);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), -10);
      var121 = (byte)84;
      var2[0] = var0;
      boolean var30 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var30) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)111;
      var0.addItem(Integer.valueOf(var285), -95);
      var285 = (byte)79;
      var0.addItem(Integer.valueOf(var285), -18);
      var285 = (byte)119;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)58;
      var0.addItem(Integer.valueOf(var285), -74);
      var285 = (byte)114;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)104;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), -92);
      var285 = (byte)59;
      var0.addItem(Integer.valueOf(var285), -74);
      var285 = (byte)45;
      var0.addItem(Integer.valueOf(var285), -92);
      var285 = (byte)105;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)65;
      var0.addItem(Integer.valueOf(var285), -55);
      var285 = (byte)97;
      var0.addItem(Integer.valueOf(var285), -92);
      var285 = (byte)117;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), -92);
      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), -92);
      var121 = (byte)121;
      var2[0] = var0;
      boolean var31 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var31) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)111;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)97;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), -37);
      var121 = (byte)120;
      var2[0] = var0;
      boolean var32 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var32) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), -10);
      var121 = (byte)101;
      var2[0] = var0;
      boolean var33 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var33) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)119;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)112;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)103;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)98;
      var0.addItem(Integer.valueOf(var285), -10);
      var285 = (byte)120;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)118;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), 0);
      var121 = (byte)99;
      var2[0] = var0;
      boolean var34 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var34) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)107;
      var0.addItem(Integer.valueOf(var285), -10);
      var285 = (byte)104;
      var0.addItem(Integer.valueOf(var285), -10);
      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)108;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), 0);
      var121 = (byte)87;
      var2[0] = var0;
      boolean var35 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var35) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)111;
      var0.addItem(Integer.valueOf(var285), -80);
      var285 = (byte)79;
      var0.addItem(Integer.valueOf(var285), -15);
      var285 = (byte)58;
      var0.addItem(Integer.valueOf(var285), -55);
      var285 = (byte)104;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), -74);
      var285 = (byte)59;
      var0.addItem(Integer.valueOf(var285), -55);
      var285 = (byte)45;
      var0.addItem(Integer.valueOf(var285), -50);
      var285 = (byte)105;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)65;
      var0.addItem(Integer.valueOf(var285), -74);
      var285 = (byte)97;
      var0.addItem(Integer.valueOf(var285), -85);
      var285 = (byte)117;
      var0.addItem(Integer.valueOf(var285), -55);
      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), -55);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), -74);
      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), -90);
      var121 = (byte)104;
      var2[0] = var0;
      boolean var36 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var36) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), 0);
      var121 = (byte)71;
      var2[0] = var0;
      boolean var37 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var37) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), 0);
      var121 = (byte)105;
      var2[0] = var0;
      boolean var38 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var38) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)118;
      var0.addItem(Integer.valueOf(var285), 0);
      var121 = (byte)65;
      var2[0] = var0;
      boolean var39 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var39) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)79;
      var0.addItem(Integer.valueOf(var285), -50);
      var285 = 146;
      var0.addItem(Integer.valueOf(var285), -74);
      short var348 = 119;
      var0.addItem(Integer.valueOf(var348), -74);
      var348 = (byte)87;
      var0.addItem(Integer.valueOf(var348), -100);
      var348 = (byte)67;
      var0.addItem(Integer.valueOf(var348), -65);
      var348 = (byte)112;
      var0.addItem(Integer.valueOf(var348), 0);
      var348 = (byte)81;
      var0.addItem(Integer.valueOf(var348), -55);
      var348 = (byte)71;
      var0.addItem(Integer.valueOf(var348), -60);
      var348 = (byte)86;
      var0.addItem(Integer.valueOf(var348), -95);
      var348 = (byte)118;
      var0.addItem(Integer.valueOf(var348), -74);
      var348 = 148;
      var0.addItem(Integer.valueOf(var348), 0);
      short var357 = 85;
      var0.addItem(Integer.valueOf(var357), -50);
      var357 = (byte)117;
      var0.addItem(Integer.valueOf(var357), -30);
      var357 = (byte)89;
      var0.addItem(Integer.valueOf(var357), -70);
      var357 = (byte)121;
      var0.addItem(Integer.valueOf(var357), -74);
      var357 = (byte)84;
      var0.addItem(Integer.valueOf(var357), -55);
      var121 = 147;
      var2[0] = var0;
      boolean var40 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var40) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var357 = (byte)65;
      var0.addItem(Integer.valueOf(var357), 0);
      var357 = 145;
      var0.addItem(Integer.valueOf(var357), 0);
      short var138 = 78;
      var2[0] = var0;
      boolean var41 = !a6.tryGetValue(Integer.valueOf(var138), var2);
      var0 = var2[0];
      if (var41) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var138), var0);
      }

      short var364 = 65;
      var0.addItem(Integer.valueOf(var364), -30);
      var364 = (byte)46;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)44;
      var0.addItem(Integer.valueOf(var364), 0);
      var138 = (byte)115;
      var2[0] = var0;
      boolean var42 = !a6.tryGetValue(Integer.valueOf(var138), var2);
      var0 = var2[0];
      if (var42) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var138), var0);
      }

      var364 = (byte)119;
      var0.addItem(Integer.valueOf(var364), 0);
      var138 = (byte)111;
      var2[0] = var0;
      boolean var43 = !a6.tryGetValue(Integer.valueOf(var138), var2);
      var0 = var2[0];
      if (var43) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var138), var0);
      }

      var364 = (byte)119;
      var0.addItem(Integer.valueOf(var364), -25);
      var364 = (byte)121;
      var0.addItem(Integer.valueOf(var364), -10);
      var364 = (byte)103;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)120;
      var0.addItem(Integer.valueOf(var364), -10);
      var364 = (byte)118;
      var0.addItem(Integer.valueOf(var364), -15);
      var138 = (byte)114;
      var2[0] = var0;
      boolean var44 = !a6.tryGetValue(Integer.valueOf(var138), var2);
      var0 = var2[0];
      if (var44) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var138), var0);
      }

      var364 = (byte)111;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)100;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)107;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)114;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)99;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)112;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)103;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)108;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)113;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)118;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)44;
      var0.addItem(Integer.valueOf(var364), -65);
      var364 = (byte)45;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)105;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)109;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)97;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)117;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)116;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)121;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)46;
      var0.addItem(Integer.valueOf(var364), -65);
      var364 = (byte)110;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)115;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)101;
      var0.addItem(Integer.valueOf(var364), 0);
      var138 = (byte)108;
      var2[0] = var0;
      boolean var45 = !a6.tryGetValue(Integer.valueOf(var138), var2);
      var0 = var2[0];
      if (var45) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var138), var0);
      }

      var364 = (byte)119;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)121;
      var0.addItem(Integer.valueOf(var364), 0);
      var138 = (byte)76;
      var2[0] = var0;
      boolean var46 = !a6.tryGetValue(Integer.valueOf(var138), var2);
      var0 = var2[0];
      if (var46) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var138), var0);
      }

      var364 = 148;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = 146;
      var0.addItem(Integer.valueOf(var364), -55);
      short var399 = 87;
      var0.addItem(Integer.valueOf(var399), -37);
      var399 = (byte)89;
      var0.addItem(Integer.valueOf(var399), -37);
      var399 = (byte)121;
      var0.addItem(Integer.valueOf(var399), -37);
      var399 = (byte)84;
      var0.addItem(Integer.valueOf(var399), -18);
      var399 = (byte)86;
      var0.addItem(Integer.valueOf(var399), -37);
      var138 = 148;
      var2[0] = var0;
      boolean var47 = !a6.tryGetValue(Integer.valueOf(var138), var2);
      var0 = var2[0];
      if (var47) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var138), var0);
      }

      var399 = (byte)32;
      var0.addItem(Integer.valueOf(var399), 0);
      byte var145 = 109;
      var2[0] = var0;
      boolean var48 = !a6.tryGetValue(Integer.valueOf(var145), var2);
      var0 = var2[0];
      if (var48) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var145), var0);
      }

      var399 = (byte)117;
      var0.addItem(Integer.valueOf(var399), 0);
      var399 = (byte)121;
      var0.addItem(Integer.valueOf(var399), 0);
      var145 = 89;
      var2[0] = var0;
      boolean var49 = !a6.tryGetValue(Integer.valueOf(var145), var2);
      var0 = var2[0];
      if (var49) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var145), var0);
      }

      var399 = (byte)111;
      var0.addItem(Integer.valueOf(var399), -111);
      var399 = (byte)45;
      var0.addItem(Integer.valueOf(var399), -92);
      var399 = (byte)105;
      var0.addItem(Integer.valueOf(var399), -55);
      var399 = (byte)79;
      var0.addItem(Integer.valueOf(var399), -25);
      var399 = (byte)58;
      var0.addItem(Integer.valueOf(var399), -92);
      var399 = (byte)97;
      var0.addItem(Integer.valueOf(var399), -92);
      var399 = (byte)65;
      var0.addItem(Integer.valueOf(var399), -74);
      var399 = (byte)117;
      var0.addItem(Integer.valueOf(var399), -92);
      var399 = (byte)46;
      var0.addItem(Integer.valueOf(var399), -74);
      var399 = (byte)101;
      var0.addItem(Integer.valueOf(var399), -111);
      var399 = (byte)59;
      var0.addItem(Integer.valueOf(var399), -92);
      var399 = (byte)44;
      var0.addItem(Integer.valueOf(var399), -92);
      var145 = 74;
      var2[0] = var0;
      boolean var50 = !a6.tryGetValue(Integer.valueOf(var145), var2);
      var0 = var2[0];
      if (var50) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var145), var0);
      }

      var399 = (byte)111;
      var0.addItem(Integer.valueOf(var399), -40);
      var399 = (byte)97;
      var0.addItem(Integer.valueOf(var399), -40);
      var399 = (byte)65;
      var0.addItem(Integer.valueOf(var399), -25);
      var399 = (byte)117;
      var0.addItem(Integer.valueOf(var399), -40);
      var399 = (byte)46;
      var0.addItem(Integer.valueOf(var399), -10);
      var399 = (byte)101;
      var0.addItem(Integer.valueOf(var399), -40);
      var399 = (byte)44;
      var0.addItem(Integer.valueOf(var399), -10);
      var145 = 46;
      var2[0] = var0;
      boolean var51 = !a6.tryGetValue(Integer.valueOf(var145), var2);
      var0 = var2[0];
      if (var51) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var145), var0);
      }

      var399 = 148;
      var0.addItem(Integer.valueOf(var399), -95);
      var399 = 146;
      var0.addItem(Integer.valueOf(var399), -95);
      var145 = 110;
      var2[0] = var0;
      boolean var52 = !a6.tryGetValue(Integer.valueOf(var145), var2);
      var0 = var2[0];
      if (var52) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var145), var0);
      }

      byte var428 = 117;
      var0.addItem(Integer.valueOf(var428), 0);
      var428 = 121;
      var0.addItem(Integer.valueOf(var428), 0);
      var428 = 118;
      var0.addItem(Integer.valueOf(var428), -40);
      l6 = new List<>();
      l6.addItem("Times");
   }
}
