package com.aspose.slides.internal.g7;

class j3b$n5 {
   public final int n5;
   public final int l6;
   public final byte k5;
   public static final j3b$n5 u3 = new j3b$n5(-1, -1, (byte)123);
   public static final j3b$n5 a6 = new j3b$n5(0, 127, (byte)0);
   public static final j3b$n5 u9 = new j3b$n5(128, 255, (byte)1);
   public static final j3b$n5 h0 = new j3b$n5(256, 383, (byte)2);
   public static final j3b$n5 c8 = new j3b$n5(384, 591, (byte)3);
   public static final j3b$n5 t2 = new j3b$n5(2304, 2431, (byte)15);
   public static final j3b$n5 s7 = new j3b$n5(1536, 1791, (byte)13);
   public static final j3b$n5 x8 = new j3b$n5(3072, 3199, (byte)21);
   public static final j3b$n5[] n3 = new j3b$n5[]{a6, u9, h0, c8, s7, t2, x8};

   public j3b$n5(int var1, int var2, byte var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final boolean n5(char var1) {
      return var1 >= this.n5 && var1 <= this.l6;
   }
}
