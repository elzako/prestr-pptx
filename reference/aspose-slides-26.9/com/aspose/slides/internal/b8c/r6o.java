package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.FormatException;

public class r6o extends com.aspose.slides.internal.v6g.h0<r6o> {
   private com.aspose.slides.ms.System.j5 n5 = new com.aspose.slides.ms.System.j5();
   private long l6;
   private static final int k5 = "yyyy".length();
   private static final int u3 = "yyyy-".length();
   private static final int a6 = "yyyy-MM".length();
   private static final int u9 = "yyyy-MM-".length();
   private static final int h0 = "yyyy-MM-dd".length();
   private static final int c8 = "yyyy-MM-ddT".length();
   private static final int t2 = "HH".length();
   private static final int s7 = "HH:".length();
   private static final int x8 = "HH:mm".length();
   private static final int n3 = "HH:mm:".length();
   private static final int y4 = "HH:mm:ss".length();
   private static final int e2 = "-".length();
   private static final int t9 = "-zz".length();
   private static final int z1 = "-zz:".length();
   private static final int t4 = "-zz:zz".length();
   private static final int q0 = "--".length();
   private static final int z3 = "--MM".length();
   private static final int m1 = "--MM-".length();
   private static final int k7 = "--MM--".length();
   private static final int m3 = "--MM-dd".length();
   private static final int z8 = "---".length();
   private static final int j5 = "---dd".length();
   private static final int[] w1 = new int[]{18, 19, 20, 21, 22, 23, 24, 25};

   public r6o() {
   }

   public r6o(String var1, int var2) {
      this();
      r6o$n5 var3 = new r6o$n5();
      if (!var3.n5(var1, var2)) {
         throw new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var1, var2));
      }

      this.n5(var3.n5());
   }

   private r6o(r6o$n5 var1) {
      this();
      this.n5(var1.n5());
   }

   private void n5(r6o$n5 var1) {
      this.n5 = new com.aspose.slides.ms.System.j5(var1.l6, var1.k5, var1.u3, var1.a6, var1.u9, var1.h0);
      if (var1.c8 != 0) {
         this.n5.n5((long)var1.c8).u3(this.n5);
      }

      this.l6 = (var1.n5 << 24 | var1.t2 << 16 | var1.s7 << 8 | var1.x8) & 4294967295L;
   }

   public static boolean n5(String var0, int var1, r6o[] var2) {
      r6o$n5 var3 = new r6o$n5();
      if (!var3.n5(var0, var1)) {
         var2[0] = new r6o();
         return false;
      } else {
         var2[0] = new r6o(var3.n5());
         return true;
      }
   }

   public r6o(com.aspose.slides.ms.System.j5 var1, int var2) {
      var1.u3(this.n5);
      int var3 = com.aspose.slides.ms.System.Xml.h0.l6(var2 & 4294967295L) - 1;
      byte var4 = 0;
      byte var5 = 0;
      byte var6;
      switch ((int)var1.a6()) {
         case 0:
            var6 = 0;
            break;
         case 1:
            var6 = 1;
            break;
         default:
            var6 = 0;
      }

      this.l6 = (var3 << 24 | var6 << 16 | var4 << 8 | var5) & 4294967295L;
   }

   public r6o(com.aspose.slides.ms.System.w1 var1, int var2) {
      var1.n5().u3(this.n5);
      com.aspose.slides.ms.System.s4 var3 = var1.k5().n3();
      int var4 = com.aspose.slides.ms.System.Xml.h0.l6(var2 & 4294967295L) - 1;
      byte var5;
      if (var3.c8() < 0.0) {
         var3.x8().u3(var3);
         var5 = 2;
      } else if (var3.c8() > 0.0) {
         var5 = 3;
      } else {
         var5 = 1;
      }

      this.l6 = (var4 << 24 | var5 << 16 | var3.l6() << 8 | var3.k5()) & 4294967295L;
   }

   private int s3() {
      return (int)((this.l6 & 4278190080L & 4294967295L) >> 24);
   }

   private int p8() {
      return (int)((this.l6 & 16711680L & 4294967295L) >> 16);
   }

   public final int n5() {
      return this.n5.e2();
   }

   public final int l6() {
      return this.n5.c8();
   }

   public final int k5() {
      return this.n5.l6();
   }

   public final int u3() {
      return this.n5.u3();
   }

   public final int a6() {
      return this.n5.h0();
   }

   public final int u9() {
      return this.n5.x8();
   }

   public final int h0() {
      return (int)(this.n5.n3() - new com.aspose.slides.ms.System.j5(this.n5.e2(), this.n5.c8(), this.n5.l6(), this.n5.u3(), this.n5.h0(), this.n5.x8()).n3());
   }

   public final int c8() {
      long var1 = (this.l6 & 65280L & 4294967295L) >> 8 & 4294967295L;
      return (int)var1;
   }

   public final int t2() {
      long var1 = this.l6 & 255L & 4294967295L;
      return (int)var1;
   }

   public static com.aspose.slides.ms.System.j5 n5(r6o var0) {
      com.aspose.slides.ms.System.j5 var1 = new com.aspose.slides.ms.System.j5();
      switch (var0.s3()) {
         case 1:
            com.aspose.slides.ms.System.j5 var2 = com.aspose.slides.ms.System.j5.s7().m3();
            com.aspose.slides.ms.System.s4 var3 = com.aspose.slides.ms.System.j5.t2(
                  new com.aspose.slides.ms.System.j5(var2.e2(), var2.c8(), var2.l6()), new com.aspose.slides.ms.System.j5(var0.n5(), var0.l6(), var0.k5())
               )
               .n3();
            var0.n5.n5(var3.n3()).u3(var1);
            break;
         case 6:
         case 7:
            var1 = new com.aspose.slides.ms.System.j5(com.aspose.slides.ms.System.j5.s7().e2(), var0.l6(), var0.k5());
            break;
         default:
            var0.n5.u3(var1);
      }

      switch (var0.p8()) {
         case 1:
            var1 = new com.aspose.slides.ms.System.j5(var1.n3(), 1L);
            break;
         case 2:
            long var6 = var1.n3() + new com.aspose.slides.ms.System.s4(var0.c8(), var0.t2(), 0).a6();
            new com.aspose.slides.ms.System.j5(var6, 1L).q0().u3(var1);
            break;
         case 3:
            long var4 = var1.n3() - new com.aspose.slides.ms.System.s4(var0.c8(), var0.t2(), 0).a6();
            if (var4 < com.aspose.slides.ms.System.j5.l6.n3()) {
               return new com.aspose.slides.ms.System.j5(var4, 2L);
            }

            new com.aspose.slides.ms.System.j5(var4, 1L).q0().u3(var1);
      }

      return var1;
   }

   public static com.aspose.slides.ms.System.w1 l6(r6o var0) {
      com.aspose.slides.ms.System.j5 var1 = new com.aspose.slides.ms.System.j5();
      switch (var0.s3()) {
         case 1:
            com.aspose.slides.ms.System.j5 var2 = com.aspose.slides.ms.System.j5.s7().m3();
            com.aspose.slides.ms.System.s4 var3 = com.aspose.slides.ms.System.j5.t2(
                  new com.aspose.slides.ms.System.j5(var2.e2(), var2.c8(), var2.l6()), new com.aspose.slides.ms.System.j5(var0.n5(), var0.l6(), var0.k5())
               )
               .n3();
            var0.n5.n5(var3.n3()).u3(var1);
            break;
         case 6:
         case 7:
            var1 = new com.aspose.slides.ms.System.j5(com.aspose.slides.ms.System.j5.s7().e2(), var0.l6(), var0.k5());
            break;
         default:
            var0.n5.u3(var1);
      }

      com.aspose.slides.ms.System.w1 var4 = new com.aspose.slides.ms.System.w1();
      switch (var0.p8()) {
         case 0:
         default:
            break;
         case 1:
            var4 = new com.aspose.slides.ms.System.w1(var1.m3(), new com.aspose.slides.ms.System.s4(0L));
            break;
         case 2:
            var4 = new com.aspose.slides.ms.System.w1(var1.m3(), new com.aspose.slides.ms.System.s4(-var0.c8(), -var0.t2(), 0));
            break;
         case 3:
            var4 = new com.aspose.slides.ms.System.w1(var1.m3(), new com.aspose.slides.ms.System.s4(var0.c8(), var0.t2(), 0));
      }

      return var4;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(64);
      switch (this.s3()) {
         case 0:
            this.n5(var1);
            var1.n5('T');
            this.l6(var1);
            break;
         case 1:
            this.l6(var1);
            break;
         case 2:
            this.n5(var1);
            break;
         case 3:
            char[] var6 = new char[a6];
            this.n5(var6, 0, this.n5(), 4);
            var6[k5] = '-';
            this.n5(var6, u3, this.l6());
            var1.n5(var6);
            break;
         case 4:
            char[] var5 = new char[k5];
            this.n5(var5, 0, this.n5(), 4);
            var1.n5(var5);
            break;
         case 5:
            char[] var4 = new char[m3];
            var4[0] = '-';
            var4[e2] = '-';
            this.n5(var4, q0, this.l6());
            var4[z3] = '-';
            this.n5(var4, m1, this.k5());
            var1.n5(var4);
            break;
         case 6:
            char[] var3 = new char[j5];
            var3[0] = '-';
            var3[e2] = '-';
            var3[q0] = '-';
            this.n5(var3, z8, this.k5());
            var1.n5(var3);
            break;
         case 7:
            char[] var2 = new char[k7];
            var2[0] = '-';
            var2[e2] = '-';
            this.n5(var2, q0, this.l6());
            var2[z3] = '-';
            var2[m1] = '-';
            var1.n5(var2);
      }

      this.k5(var1);
      return var1.toString();
   }

   private void n5(com.aspose.slides.internal.l7h.a5 var1) {
      char[] var2 = new char[h0];
      this.n5(var2, 0, this.n5(), 4);
      var2[k5] = '-';
      this.n5(var2, u3, this.l6());
      var2[a6] = '-';
      this.n5(var2, u9, this.k5());
      var1.n5(var2);
   }

   private void l6(com.aspose.slides.internal.l7h.a5 var1) {
      char[] var2 = new char[y4];
      this.n5(var2, 0, this.u3());
      var2[t2] = ':';
      this.n5(var2, s7, this.a6());
      var2[x8] = ':';
      this.n5(var2, n3, this.u9());
      var1.n5(var2);
      int var3 = this.h0();
      if (var3 != 0) {
         int var4 = 7;

         while (var3 % 10 == 0) {
            var4--;
            var3 /= 10;
         }

         var2 = new char[var4 + 1];
         var2[0] = '.';
         this.n5(var2, 1, var3, var4);
         var1.n5(var2);
      }
   }

   private void k5(com.aspose.slides.internal.l7h.a5 var1) {
      switch (this.p8()) {
         case 1:
            var1.n5('Z');
            break;
         case 2:
            char[] var3 = new char[t4];
            var3[0] = '-';
            this.n5(var3, e2, this.c8());
            var3[t9] = ':';
            this.n5(var3, z1, this.t2());
            var1.n5(var3);
            break;
         case 3:
            char[] var2 = new char[t4];
            var2[0] = '+';
            this.n5(var2, e2, this.c8());
            var2[t9] = ':';
            this.n5(var2, z1, this.t2());
            var1.n5(var2);
      }
   }

   private void n5(char[] var1, int var2, int var3, int var4) {
      while (var4-- != 0) {
         var1[var2 + var4] = (char)(var3 % 10 + 48);
         var3 /= 10;
      }
   }

   private void n5(char[] var1, int var2, int var3) {
      var1[var2] = (char)(var3 / 10 + 48);
      var1[var2 + 1] = (char)(var3 % 10 + 48);
   }

   public void k5(r6o var1) {
      var1 = var1 == null ? new r6o() : var1;
      this.n5.u3(var1.n5);
      var1.l6 = this.l6;
   }

   public r6o s7() {
      r6o var1 = new r6o();
      this.k5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.s7();
   }

   private boolean u3(r6o var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && var1.l6 == this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r6o) ? false : this.u3((r6o)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r6o Clone() {
      return this.s7();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r6o bridgeArg0) {
      this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   static int x8() {
      return h0;
   }

   // $VF: synthetic method
   static int n3() {
      return c8;
   }

   // $VF: synthetic method
   static int y4() {
      return k5;
   }

   // $VF: synthetic method
   static int e2() {
      return u3;
   }

   // $VF: synthetic method
   static int t9() {
      return a6;
   }

   // $VF: synthetic method
   static int z1() {
      return e2;
   }

   // $VF: synthetic method
   static int t4() {
      return q0;
   }

   // $VF: synthetic method
   static int q0() {
      return z3;
   }

   // $VF: synthetic method
   static int z3() {
      return m1;
   }

   // $VF: synthetic method
   static int m1() {
      return m3;
   }

   // $VF: synthetic method
   static int k7() {
      return k7;
   }

   // $VF: synthetic method
   static int m3() {
      return z8;
   }

   // $VF: synthetic method
   static int z8() {
      return j5;
   }

   // $VF: synthetic method
   static int j5() {
      return u9;
   }

   // $VF: synthetic method
   static int w1() {
      return t2;
   }

   // $VF: synthetic method
   static int r4() {
      return s7;
   }

   // $VF: synthetic method
   static int c4() {
      return x8;
   }

   // $VF: synthetic method
   static int y2() {
      return n3;
   }

   // $VF: synthetic method
   static int y1() {
      return y4;
   }

   // $VF: synthetic method
   static int a0() {
      return t9;
   }

   // $VF: synthetic method
   static int d2() {
      return z1;
   }

   // $VF: synthetic method
   static int d5() {
      return t4;
   }
}
