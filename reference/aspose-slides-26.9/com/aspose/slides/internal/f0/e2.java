package com.aspose.slides.internal.f0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class e2 extends n5 {
   private static final List<String> l6;
   private static final int[] k5 = new int[256];
   private final com.aspose.slides.internal.v0.l6 u3 = com.aspose.slides.internal.v0.l6.n5("WinAnsiEncoding");
   private static final Dictionary<Integer, Dictionary<Integer, Integer>> a6 = new Dictionary<>();
   private boolean u9 = false;

   public e2() {
      this(false);
   }

   public e2(boolean var1) {
      this.u9 = var1;
   }

   @Override
   public String n5() {
      return "WinAnsiEncoding";
   }

   @Override
   public String l6() {
      return "Times-Roman";
   }

   @Override
   public String k5() {
      return "Times Roman";
   }

   @Override
   public int l6(int var1) {
      return var1 * 683;
   }

   @Override
   public int k5(int var1) {
      return var1 * 662;
   }

   @Override
   public int u3(int var1) {
      return var1 * -217;
   }

   @Override
   public int a6(int var1) {
      return var1 * 450;
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
      k5[198] = 889;
      k5[193] = 722;
      k5[194] = 722;
      k5[196] = 722;
      k5[192] = 722;
      k5[197] = 722;
      k5[195] = 722;
      k5[66] = 667;
      k5[67] = 667;
      k5[199] = 667;
      k5[68] = 722;
      k5[69] = 611;
      k5[201] = 611;
      k5[202] = 611;
      k5[203] = 611;
      k5[200] = 611;
      k5[208] = 722;
      k5[128] = 500;
      k5[70] = 556;
      k5[71] = 722;
      k5[72] = 722;
      k5[73] = 333;
      k5[205] = 333;
      k5[206] = 333;
      k5[207] = 333;
      k5[204] = 333;
      k5[74] = 389;
      k5[75] = 722;
      k5[76] = 611;
      k5[77] = 889;
      k5[78] = 722;
      k5[209] = 722;
      k5[79] = 722;
      k5[140] = 889;
      k5[211] = 722;
      k5[212] = 722;
      k5[214] = 722;
      k5[210] = 722;
      k5[216] = 722;
      k5[213] = 722;
      k5[80] = 556;
      k5[81] = 722;
      k5[82] = 667;
      k5[83] = 556;
      k5[138] = 556;
      k5[84] = 611;
      k5[222] = 556;
      k5[85] = 722;
      k5[218] = 722;
      k5[219] = 722;
      k5[220] = 722;
      k5[217] = 722;
      k5[86] = 722;
      k5[87] = 944;
      k5[88] = 722;
      k5[89] = 722;
      k5[221] = 722;
      k5[159] = 722;
      k5[90] = 611;
      k5[142] = 611;
      k5[97] = 444;
      k5[225] = 444;
      k5[226] = 444;
      k5[180] = 333;
      k5[228] = 444;
      k5[230] = 667;
      k5[224] = 444;
      k5[38] = 778;
      k5[229] = 444;
      k5[94] = 469;
      k5[126] = 541;
      k5[42] = 500;
      k5[64] = 921;
      k5[227] = 444;
      k5[98] = 500;
      k5[92] = 278;
      k5[124] = 200;
      k5[123] = 480;
      k5[125] = 480;
      k5[91] = 333;
      k5[93] = 333;
      k5[166] = 200;
      k5[149] = 350;
      k5[99] = 444;
      k5[231] = 444;
      k5[184] = 333;
      k5[162] = 500;
      k5[136] = 333;
      k5[58] = 278;
      k5[44] = 250;
      k5[169] = 760;
      k5[164] = 500;
      k5[100] = 500;
      k5[134] = 500;
      k5[135] = 500;
      k5[176] = 400;
      k5[168] = 333;
      k5[247] = 564;
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
      k5[61] = 564;
      k5[240] = 500;
      k5[33] = 333;
      k5[161] = 333;
      k5[102] = 333;
      k5[53] = 500;
      k5[131] = 500;
      k5[52] = 500;
      k5[103] = 500;
      k5[223] = 500;
      k5[96] = 333;
      k5[62] = 564;
      k5[171] = 500;
      k5[187] = 500;
      k5[139] = 333;
      k5[155] = 333;
      k5[104] = 500;
      k5[45] = 333;
      k5[105] = 278;
      k5[237] = 278;
      k5[238] = 278;
      k5[239] = 278;
      k5[236] = 278;
      k5[106] = 278;
      k5[107] = 500;
      k5[108] = 278;
      k5[60] = 564;
      k5[172] = 564;
      k5[109] = 778;
      k5[175] = 333;
      k5[181] = 500;
      k5[215] = 564;
      k5[110] = 500;
      k5[57] = 500;
      k5[241] = 500;
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
      k5[170] = 276;
      k5[186] = 310;
      k5[248] = 500;
      k5[245] = 500;
      k5[112] = 500;
      k5[182] = 453;
      k5[40] = 333;
      k5[41] = 333;
      k5[37] = 833;
      k5[46] = 250;
      k5[183] = 250;
      k5[137] = 1000;
      k5[43] = 564;
      k5[177] = 564;
      k5[113] = 500;
      k5[63] = 444;
      k5[191] = 444;
      k5[34] = 408;
      k5[132] = 444;
      k5[147] = 444;
      k5[148] = 444;
      k5[145] = 333;
      k5[146] = 333;
      k5[130] = 333;
      k5[39] = 180;
      k5[114] = 333;
      k5[174] = 760;
      k5[115] = 389;
      k5[154] = 389;
      k5[167] = 500;
      k5[59] = 278;
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
      k5[153] = 980;
      k5[50] = 500;
      k5[178] = 300;
      k5[117] = 500;
      k5[250] = 500;
      k5[251] = 500;
      k5[252] = 500;
      k5[249] = 500;
      k5[95] = 500;
      k5[118] = 500;
      k5[119] = 722;
      k5[120] = 500;
      k5[121] = 500;
      k5[253] = 500;
      k5[255] = 500;
      k5[165] = 500;
      k5[122] = 444;
      k5[158] = 444;
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
      var0.addItem(Integer.valueOf(var4), -35);
      var4 = (byte)87;
      var0.addItem(Integer.valueOf(var4), -35);
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
      var0.addItem(Integer.valueOf(var4), -15);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -10);
      var1 = (byte)112;
      var2[0] = var0;
      boolean var6 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var6) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)121;
      var0.addItem(Integer.valueOf(var4), -10);
      var1 = (byte)80;
      var2[0] = var0;
      boolean var7 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var7) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), 0);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -15);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -92);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -111);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), 0);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -111);
      var1 = (byte)86;
      var2[0] = var0;
      boolean var8 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var8) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)111;
      var0.addItem(Integer.valueOf(var4), -129);
      var4 = (byte)79;
      var0.addItem(Integer.valueOf(var4), -40);
      var4 = (byte)58;
      var0.addItem(Integer.valueOf(var4), -74);
      var4 = (byte)71;
      var0.addItem(Integer.valueOf(var4), -15);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -129);
      var4 = (byte)59;
      var0.addItem(Integer.valueOf(var4), -74);
      var4 = (byte)45;
      var0.addItem(Integer.valueOf(var4), -100);
      var4 = (byte)105;
      var0.addItem(Integer.valueOf(var4), -60);
      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -135);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -111);
      var4 = (byte)117;
      var0.addItem(Integer.valueOf(var4), -75);
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
      var0.addItem(Integer.valueOf(var4), -20);
      var4 = (byte)97;
      var0.addItem(Integer.valueOf(var4), -25);
      var4 = (byte)46;
      var0.addItem(Integer.valueOf(var4), -65);
      var4 = (byte)101;
      var0.addItem(Integer.valueOf(var4), -15);
      var4 = (byte)44;
      var0.addItem(Integer.valueOf(var4), -65);
      var1 = (byte)32;
      var2[0] = var0;
      boolean var10 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var10) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var4 = (byte)65;
      var0.addItem(Integer.valueOf(var4), -55);
      var4 = (byte)87;
      var0.addItem(Integer.valueOf(var4), -30);
      var4 = 147;
      var0.addItem(Integer.valueOf(var4), 0);
      short var188 = 89;
      var0.addItem(Integer.valueOf(var188), -90);
      var188 = (byte)84;
      var0.addItem(Integer.valueOf(var188), -18);
      var188 = 145;
      var0.addItem(Integer.valueOf(var188), 0);
      short var191 = 86;
      var0.addItem(Integer.valueOf(var191), -50);
      var1 = (byte)97;
      var2[0] = var0;
      boolean var11 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var11) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)119;
      var0.addItem(Integer.valueOf(var191), -15);
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
      var0.addItem(Integer.valueOf(var191), -20);
      var1 = (byte)70;
      var2[0] = var0;
      boolean var12 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var12) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)111;
      var0.addItem(Integer.valueOf(var191), -15);
      var191 = (byte)105;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)114;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)97;
      var0.addItem(Integer.valueOf(var191), -15);
      var191 = (byte)65;
      var0.addItem(Integer.valueOf(var191), -74);
      var191 = (byte)46;
      var0.addItem(Integer.valueOf(var191), -80);
      var191 = (byte)101;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)44;
      var0.addItem(Integer.valueOf(var191), -80);
      var1 = (byte)85;
      var2[0] = var0;
      boolean var13 = !a6.tryGetValue(Integer.valueOf(var1), var2);
      var0 = var2[0];
      if (var13) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var1), var0);
      }

      var191 = (byte)65;
      var0.addItem(Integer.valueOf(var191), -40);
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
      var0.addItem(Integer.valueOf(var191), -40);
      var191 = (byte)87;
      var0.addItem(Integer.valueOf(var191), -30);
      var191 = (byte)89;
      var0.addItem(Integer.valueOf(var191), -55);
      var191 = (byte)46;
      var0.addItem(Integer.valueOf(var191), 0);
      var191 = (byte)86;
      var0.addItem(Integer.valueOf(var191), -40);
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
      var0.addItem(Integer.valueOf(var227), -50);
      var227 = (byte)32;
      var0.addItem(Integer.valueOf(var227), -74);
      var227 = 146;
      var0.addItem(Integer.valueOf(var227), -74);
      short var230 = 114;
      var0.addItem(Integer.valueOf(var230), -50);
      var230 = (byte)116;
      var0.addItem(Integer.valueOf(var230), -18);
      var230 = (byte)108;
      var0.addItem(Integer.valueOf(var230), -10);
      var230 = (byte)115;
      var0.addItem(Integer.valueOf(var230), -55);
      var230 = (byte)118;
      var0.addItem(Integer.valueOf(var230), -50);
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
      var0.addItem(Integer.valueOf(var230), -10);
      var230 = (byte)97;
      var0.addItem(Integer.valueOf(var230), -10);
      var230 = (byte)104;
      var0.addItem(Integer.valueOf(var230), 0);
      var230 = (byte)46;
      var0.addItem(Integer.valueOf(var230), -65);
      var230 = (byte)101;
      var0.addItem(Integer.valueOf(var230), 0);
      var230 = (byte)44;
      var0.addItem(Integer.valueOf(var230), -65);
      var116 = (byte)75;
      var2[0] = var0;
      boolean var21 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var21) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var230 = (byte)111;
      var0.addItem(Integer.valueOf(var230), -35);
      var230 = (byte)79;
      var0.addItem(Integer.valueOf(var230), -30);
      var230 = (byte)117;
      var0.addItem(Integer.valueOf(var230), -15);
      var230 = (byte)121;
      var0.addItem(Integer.valueOf(var230), -25);
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
      var0.addItem(Integer.valueOf(var230), -55);
      var230 = (byte)85;
      var0.addItem(Integer.valueOf(var230), -40);
      var230 = (byte)89;
      var0.addItem(Integer.valueOf(var230), -65);
      var230 = (byte)84;
      var0.addItem(Integer.valueOf(var230), -60);
      var230 = (byte)86;
      var0.addItem(Integer.valueOf(var230), -80);
      var116 = 145;
      var2[0] = var0;
      boolean var23 = !a6.tryGetValue(Integer.valueOf(var116), var2);
      var0 = var2[0];
      if (var23) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var116), var0);
      }

      var230 = (byte)65;
      var0.addItem(Integer.valueOf(var230), -80);
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
      var0.addItem(Integer.valueOf(var255), -5);
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
      var0.addItem(Integer.valueOf(var255), -35);
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
      var0.addItem(Integer.valueOf(var255), 0);
      var255 = (byte)118;
      var0.addItem(Integer.valueOf(var255), -15);
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
      var0.addItem(Integer.valueOf(var255), -70);
      short var279 = 32;
      var0.addItem(Integer.valueOf(var279), 0);
      var279 = 146;
      var0.addItem(Integer.valueOf(var279), -70);
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
      var0.addItem(Integer.valueOf(var282), 0);
      var282 = (byte)105;
      var0.addItem(Integer.valueOf(var282), -20);
      var282 = 146;
      var0.addItem(Integer.valueOf(var282), 55);
      short var285 = 97;
      var0.addItem(Integer.valueOf(var285), -10);
      var285 = (byte)102;
      var0.addItem(Integer.valueOf(var285), -25);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)108;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), 0);
      var121 = (byte)84;
      var2[0] = var0;
      boolean var30 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var30) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)111;
      var0.addItem(Integer.valueOf(var285), -80);
      var285 = (byte)79;
      var0.addItem(Integer.valueOf(var285), -18);
      var285 = (byte)119;
      var0.addItem(Integer.valueOf(var285), -80);
      var285 = (byte)58;
      var0.addItem(Integer.valueOf(var285), -50);
      var285 = (byte)114;
      var0.addItem(Integer.valueOf(var285), -35);
      var285 = (byte)104;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), -74);
      var285 = (byte)59;
      var0.addItem(Integer.valueOf(var285), -55);
      var285 = (byte)45;
      var0.addItem(Integer.valueOf(var285), -92);
      var285 = (byte)105;
      var0.addItem(Integer.valueOf(var285), -35);
      var285 = (byte)65;
      var0.addItem(Integer.valueOf(var285), -93);
      var285 = (byte)97;
      var0.addItem(Integer.valueOf(var285), -80);
      var285 = (byte)117;
      var0.addItem(Integer.valueOf(var285), -45);
      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), -80);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), -74);
      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), -70);
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
      var0.addItem(Integer.valueOf(var285), -65);
      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), -65);
      var121 = (byte)120;
      var2[0] = var0;
      boolean var32 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var32) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), -15);
      var121 = (byte)101;
      var2[0] = var0;
      boolean var33 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var33) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)119;
      var0.addItem(Integer.valueOf(var285), -25);
      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), -15);
      var285 = (byte)112;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)103;
      var0.addItem(Integer.valueOf(var285), -15);
      var285 = (byte)98;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)120;
      var0.addItem(Integer.valueOf(var285), -15);
      var285 = (byte)118;
      var0.addItem(Integer.valueOf(var285), -25);
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
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)104;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), -15);
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
      var0.addItem(Integer.valueOf(var285), -10);
      var285 = (byte)58;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)104;
      var0.addItem(Integer.valueOf(var285), 0);
      var285 = (byte)44;
      var0.addItem(Integer.valueOf(var285), -92);
      var285 = (byte)59;
      var0.addItem(Integer.valueOf(var285), -37);
      var285 = (byte)45;
      var0.addItem(Integer.valueOf(var285), -65);
      var285 = (byte)105;
      var0.addItem(Integer.valueOf(var285), -40);
      var285 = (byte)65;
      var0.addItem(Integer.valueOf(var285), -120);
      var285 = (byte)97;
      var0.addItem(Integer.valueOf(var285), -80);
      var285 = (byte)117;
      var0.addItem(Integer.valueOf(var285), -50);
      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), -73);
      var285 = (byte)46;
      var0.addItem(Integer.valueOf(var285), -92);
      var285 = (byte)101;
      var0.addItem(Integer.valueOf(var285), -80);
      var121 = (byte)104;
      var2[0] = var0;
      boolean var36 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var36) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)121;
      var0.addItem(Integer.valueOf(var285), -5);
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
      var0.addItem(Integer.valueOf(var285), -25);
      var121 = (byte)65;
      var2[0] = var0;
      boolean var39 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var39) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var285 = (byte)79;
      var0.addItem(Integer.valueOf(var285), -55);
      var285 = 146;
      var0.addItem(Integer.valueOf(var285), -111);
      short var348 = 119;
      var0.addItem(Integer.valueOf(var348), -92);
      var348 = (byte)87;
      var0.addItem(Integer.valueOf(var348), -90);
      var348 = (byte)67;
      var0.addItem(Integer.valueOf(var348), -40);
      var348 = (byte)112;
      var0.addItem(Integer.valueOf(var348), 0);
      var348 = (byte)81;
      var0.addItem(Integer.valueOf(var348), -55);
      var348 = (byte)71;
      var0.addItem(Integer.valueOf(var348), -40);
      var348 = (byte)86;
      var0.addItem(Integer.valueOf(var348), -135);
      var348 = (byte)118;
      var0.addItem(Integer.valueOf(var348), -74);
      var348 = 148;
      var0.addItem(Integer.valueOf(var348), 0);
      short var357 = 85;
      var0.addItem(Integer.valueOf(var357), -55);
      var357 = (byte)117;
      var0.addItem(Integer.valueOf(var357), 0);
      var357 = (byte)89;
      var0.addItem(Integer.valueOf(var357), -105);
      var357 = (byte)121;
      var0.addItem(Integer.valueOf(var357), -92);
      var357 = (byte)84;
      var0.addItem(Integer.valueOf(var357), -111);
      var121 = 147;
      var2[0] = var0;
      boolean var40 = !a6.tryGetValue(Integer.valueOf(var121), var2);
      var0 = var2[0];
      if (var40) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var121), var0);
      }

      var357 = (byte)65;
      var0.addItem(Integer.valueOf(var357), -80);
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
      var0.addItem(Integer.valueOf(var364), -35);
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
      var0.addItem(Integer.valueOf(var364), 0);
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
      var0.addItem(Integer.valueOf(var364), -18);
      var364 = (byte)108;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)113;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)118;
      var0.addItem(Integer.valueOf(var364), 0);
      var364 = (byte)44;
      var0.addItem(Integer.valueOf(var364), -40);
      var364 = (byte)45;
      var0.addItem(Integer.valueOf(var364), -20);
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
      var0.addItem(Integer.valueOf(var364), -55);
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
      var0.addItem(Integer.valueOf(var364), -10);
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
      var0.addItem(Integer.valueOf(var364), -92);
      short var399 = 87;
      var0.addItem(Integer.valueOf(var399), -74);
      var399 = (byte)89;
      var0.addItem(Integer.valueOf(var399), -100);
      var399 = (byte)121;
      var0.addItem(Integer.valueOf(var399), -55);
      var399 = (byte)84;
      var0.addItem(Integer.valueOf(var399), -92);
      var399 = (byte)86;
      var0.addItem(Integer.valueOf(var399), -100);
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
      var0.addItem(Integer.valueOf(var399), -110);
      var399 = (byte)45;
      var0.addItem(Integer.valueOf(var399), -111);
      var399 = (byte)105;
      var0.addItem(Integer.valueOf(var399), -55);
      var399 = (byte)79;
      var0.addItem(Integer.valueOf(var399), -30);
      var399 = (byte)58;
      var0.addItem(Integer.valueOf(var399), -92);
      var399 = (byte)97;
      var0.addItem(Integer.valueOf(var399), -100);
      var399 = (byte)65;
      var0.addItem(Integer.valueOf(var399), -120);
      var399 = (byte)117;
      var0.addItem(Integer.valueOf(var399), -111);
      var399 = (byte)46;
      var0.addItem(Integer.valueOf(var399), -129);
      var399 = (byte)101;
      var0.addItem(Integer.valueOf(var399), -100);
      var399 = (byte)59;
      var0.addItem(Integer.valueOf(var399), -92);
      var399 = (byte)44;
      var0.addItem(Integer.valueOf(var399), -129);
      var145 = 74;
      var2[0] = var0;
      boolean var50 = !a6.tryGetValue(Integer.valueOf(var145), var2);
      var0 = var2[0];
      if (var50) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var145), var0);
      }

      var399 = (byte)111;
      var0.addItem(Integer.valueOf(var399), 0);
      var399 = (byte)97;
      var0.addItem(Integer.valueOf(var399), 0);
      var399 = (byte)65;
      var0.addItem(Integer.valueOf(var399), -60);
      var399 = (byte)117;
      var0.addItem(Integer.valueOf(var399), 0);
      var399 = (byte)46;
      var0.addItem(Integer.valueOf(var399), 0);
      var399 = (byte)101;
      var0.addItem(Integer.valueOf(var399), 0);
      var399 = (byte)44;
      var0.addItem(Integer.valueOf(var399), 0);
      var145 = 46;
      var2[0] = var0;
      boolean var51 = !a6.tryGetValue(Integer.valueOf(var145), var2);
      var0 = var2[0];
      if (var51) {
         var0 = new Dictionary();
         a6.addItem(Integer.valueOf(var145), var0);
      }

      var399 = 148;
      var0.addItem(Integer.valueOf(var399), -70);
      var399 = 146;
      var0.addItem(Integer.valueOf(var399), -70);
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
      var0.addItem(Integer.valueOf(var428), -15);
      var428 = 118;
      var0.addItem(Integer.valueOf(var428), -40);
      l6 = new List<>();
      l6.addItem("Times");
   }
}
