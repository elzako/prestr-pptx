package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class e4z {
   private final com.aspose.slides.internal.o9b.n3 l6;
   private final com.aspose.slides.internal.p1s.l6 k5;
   private final boolean u3;
   private final float a6;
   private byte u9 = 1;
   private final int h0;
   public final String n5;
   private final int c8;
   private final boolean t2;
   private float s7 = Float.NaN;
   private final boolean x8;
   private Dictionary<Integer, Integer> n3;
   private static final Dictionary<String, Dictionary<Integer, Integer>> y4 = t2();

   public final boolean n5(e4z var1) {
      return n5(var1, this.n5, this.u9, this.h0, this.c8, this.a6, this.t2);
   }

   @Override
   public boolean equals(Object obj) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(obj, e4z.class));
   }

   public static boolean n5(e4z var0, String var1, byte var2, int var3, int var4, float var5, boolean var6) {
      return var0 != null
         && com.aspose.slides.ms.System.d1.a6(var0.n5, var1)
         && var0.u9 == var2
         && var0.h0 == var3
         && var0.c8 == var4
         && var0.t2 == var6
         && com.aspose.slides.internal.n8e.v4.n5(var0.a6, var5);
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   public final com.aspose.slides.internal.o9b.n3 n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.p1s.l6 l6() {
      return this.k5;
   }

   public final int k5() {
      return this.u3 ? this.l6.x8() : this.c8;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final float a6() {
      return this.s7;
   }

   public final boolean u9() {
      return this.x8;
   }

   public final float h0() {
      return this.a6;
   }

   public final byte c8() {
      return this.u9;
   }

   final boolean n5(char var1) {
      if (!this.k5.n5().a0()) {
         return false;
      }

      byte[] var2 = f8y.n5(var1, this.u9);
      com.aspose.slides.internal.e1x.a5 var3 = this.k5.n5().h0();

      for (byte var7 : var2) {
         if ((var7 & 255) > 255) {
            return false;
         }

         com.aspose.slides.internal.e1x.u6 var8 = var3.n5((char)(61440 + (var7 & 255)));
         if (var8 == null) {
            var8 = var3.n5((char)(61696 + (var7 & 255)));
         }

         com.aspose.slides.internal.e1x.u6 var9 = var8;
         if (var9 == null) {
            var9 = var3.n5((char)(61952 + (var7 & 255)));
         }

         com.aspose.slides.internal.e1x.u6 var10 = var9;
         if (var10 == null) {
            return false;
         }
      }

      return true;
   }

   final String n5(String var1) {
      if (this.n3 == null) {
         return var1;
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.e1x.a5 var3 = this.l6().n5().h0();

      for (int var4 = 0; var4 < var1.length(); var4++) {
         int var5 = var1.codePointAt(var4);
         int var6 = var5;
         int var7 = 0;
         Integer[] var8 = new Integer[]{var7};
         boolean var9 = var3.n5(var5) == null && this.n3.tryGetValue(var5, var8) && var3.n5(var8[0]) != null;
         var7 = var8[0];
         if (var9) {
            var6 = var7;
         }

         var2.n5(com.aspose.slides.ms.System.z3.l6(var6));
      }

      return var2.toString();
   }

   final boolean n5(int var1) {
      com.aspose.slides.internal.e1x.a5 var2 = this.l6().n5().h0();
      if (var2.n5(var1) != null) {
         return true;
      }

      int var3 = 0;
      Integer[] var4 = new Integer[]{var3};
      boolean var5 = this.n3 == null || !this.n3.tryGetValue(var1, var4);
      var3 = var4[0];
      return var5 ? false : var2.n5(var3) != null;
   }

   public e4z(
      String var1,
      byte var2,
      int var3,
      float var4,
      int var5,
      boolean var6,
      boolean var7,
      com.aspose.slides.internal.p1s.l6 var8,
      com.aspose.slides.internal.o9b.n3 var9,
      boolean var10
   ) {
      this.a6 = var4;
      this.u9 = var2;
      this.c8 = var5;
      this.n5 = var1;
      this.h0 = var3;
      this.t2 = var6;
      this.u3 = var7;
      this.k5 = var8;
      this.x8 = var10;
      if (var7) {
         this.s7 = (float)com.aspose.slides.ms.System.q1.n5((double)(this.k5.u9()), (int)(1));
         if (this.s7 == 0.0F) {
            com.aspose.slides.internal.e1x.i1 var11 = this.k5.n5();
            float var12 = var11.z8() * 1000;
            float var13 = var11.j5() * 1000;
            this.s7 = (var13 + var13 * 0.1F) / var12;
         }
      }

      this.l6 = var9;
      Dictionary[] var14 = new Dictionary[]{this.n3};
      y4.tryGetValue(this.n5, var14);
      this.n3 = var14[0];
   }

   private static Dictionary<String, Dictionary<Integer, Integer>> t2() {
      Dictionary var0 = new Dictionary();
      int[][] var1 = new int[][]{
         {97, 945},
         {98, 946},
         {99, 967},
         {100, 948},
         {101, 949},
         {102, 966},
         {103, 947},
         {104, 951},
         {105, 953},
         {106, 981},
         {107, 954},
         {108, 955},
         {109, 956},
         {110, 957},
         {111, 959},
         {112, 960},
         {113, 952},
         {114, 961},
         {115, 963},
         {116, 964},
         {117, 965},
         {118, 982},
         {119, 969},
         {120, 958},
         {121, 968},
         {122, 950},
         {65, 913},
         {66, 914},
         {67, 935},
         {68, 916},
         {69, 917},
         {70, 934},
         {71, 915},
         {72, 919},
         {73, 921},
         {74, 977},
         {75, 922},
         {76, 923},
         {77, 924},
         {78, 925},
         {79, 927},
         {80, 928},
         {81, 920},
         {82, 929},
         {83, 931},
         {84, 932},
         {85, 933},
         {86, 962},
         {87, 937},
         {88, 926},
         {89, 936},
         {90, 918}
      };
      Dictionary var2 = new Dictionary();

      for (int var3 = 0; var3 < com.aspose.slides.ms.System.u3.n5(var1, 2).a6(0); var3++) {
         var2.set_Item(var1[var3][0], var1[var3][1]);
         var2.set_Item(var1[var3][1], var1[var3][0]);
      }

      var0.set_Item("Symbol", var2);
      return var0;
   }
}
