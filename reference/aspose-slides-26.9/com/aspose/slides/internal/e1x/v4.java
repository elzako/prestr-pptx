package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;

public class v4 {
   private final com.aspose.slides.internal.n2d.k7 n5 = new com.aspose.slides.internal.n2d.k7();
   private final com.aspose.slides.internal.n2d.k7 l6 = new com.aspose.slides.internal.n2d.k7();
   private final i1 k5;
   private boolean u3;

   public v4(i1 var1, boolean var2, boolean var3) {
      this.k5 = var1;
      this.u3 = var3;
      if (!var1.c4() && !var2) {
         this.n5(65535);
      } else {
         this.u3();
      }
   }

   public v4(i1 var1, boolean var2) {
      this(var1, var2, false);
   }

   public final int n5(int var1) {
      Object var2 = this.n5.a6(var1);
      int var3;
      if (var2 != null) {
         var3 = com.aspose.slides.internal.v6g.k5.u3(var2, int.class);
      } else {
         u6 var4 = this.k5.h0().l6(var1);
         if (var1 == 65535 && var4.l6() != 65535) {
            var4 = new u6(0, 0, var4.k5(), var4.u3());
         }

         var3 = this.n5(var4, var1);
      }

      return var3;
   }

   public final void n5(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         char var3 = var1.charAt(var2);
         u6 var4 = this.k5.h0().l6(var3);
         this.n5(var4, var3);
      }
   }

   public final int n5(u6 var1, int var2) {
      Object var3 = this.n5.a6(var2);
      var3 = this.l6.a6(var1.l6());
      int var4;
      if (var3 != null) {
         var4 = com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
         if (this.n5.l6(var2)) {
            this.n5.l6(var2, var4);
         } else {
            this.n5.n5(var2, var4);
         }
      } else {
         var4 = this.l6.n5();
         this.l6.n5(var1.l6(), var4);
         if (this.n5.l6(var2)) {
            this.n5.l6(var2, var4);
         } else {
            this.n5.n5(var2, var4);
         }
      }

      return var4;
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1, boolean var2, boolean var3) {
      b3 var4 = new b3();
      if (this.k5.c4() && this.u3) {
         var4.n5(this.k5, var1);
      } else {
         var4.n5(this.k5, this.n5, this.l6, var1, var2, var3);
      }
   }

   public final Dictionary<Integer, t1> n5() {
      b3 var1 = new b3();
      return var1.n5(this.k5, this.l6, this.k5.t2());
   }

   public final com.aspose.slides.internal.n2d.k7 l6() {
      return this.n5;
   }

   public final i1 k5() {
      return this.k5;
   }

   private void u3() {
      com.aspose.slides.internal.v3s.u3 var1 = com.aspose.slides.internal.v6g.k5.n5(this.k5.r4().n5(), com.aspose.slides.internal.v3s.u3.class);
      if (var1 != null) {
         int var2 = var1.n5();

         for (int var3 = 0; var3 < var2; var3++) {
            int var4 = var1.k5()[var3];
            int var5 = var1.l6()[var3];

            for (int var6 = var4; var6 <= var5; var6++) {
               char var7 = (char)var6;
               u6 var8 = this.k5.h0().l6(var7);
               this.n5.n5(var7, var8.l6());
            }
         }
      } else {
         com.aspose.slides.internal.v3s.l6 var9 = com.aspose.slides.internal.v6g.k5.n5(this.k5.r4().n5(), com.aspose.slides.internal.v3s.l6.class);
         if (var9 != null) {
            for (char var10 = 0; var10 < '\uffff'; var10++) {
               int var11 = var9.n5(var10);
               this.n5.n5(var10, var11);
            }
         }
      }
   }
}
