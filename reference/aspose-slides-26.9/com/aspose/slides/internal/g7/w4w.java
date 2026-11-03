package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class w4w extends c5q {
   private p6w l6;
   private int k5;
   private int u3;
   private f1c a6;
   private f1c u9;
   private int c8;
   private int t2;
   private List<g8v> s7 = new List<>();

   public w4w(long var1, int var3) {
      super(var1, var3);
   }

   public final p6w l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }

   public final int u3() {
      return this.u3;
   }

   public final f1c a6() {
      return this.a6;
   }

   public final f1c u9() {
      return this.u9;
   }

   public final int h0() {
      return this.c8;
   }

   public final int c8() {
      return this.t2;
   }

   public final g8v[] t2() {
      return this.s7.toArray(new g8v[0]);
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      int var2 = var1.n3();
      this.k5 = var1.n3();
      this.u3 = var1.n3();
      int var3 = var1.n3();
      int var4 = var1.n3();
      this.c8 = var1.n3() & 65535;
      this.t2 = var1.n3() & 65535;

      for (int var5 = 0; var5 < this.c8; var5++) {
         List var6 = new List();

         for (int var7 = 0; var7 < this.t2; var7++) {
            o9i var8 = null;
            if ((this.k5 & 65535) != 0) {
               var8 = f1s.n5(new o9i(this.k5, var1.n5(), this.n5 & 4294967295L, true), var1);
            }

            o9i var9 = null;
            if ((this.u3 & 65535) != 0) {
               var9 = f1s.n5(new o9i(this.u3, var1.n5(), this.n5 & 4294967295L, true), var1);
            }

            var6.addItem(new k1d(var8, var9));
         }

         this.s7.addItem(new g8v(var6));
      }

      this.l6 = f1s.n5(new p6w(this.n5 & 4294967295L, var2 & 65535), var1);
      this.a6 = f1s.n5(new f1c(this.n5 & 4294967295L, var3 & 65535), var1);
      this.u9 = f1s.n5(new f1c(this.n5 & 4294967295L, var4 & 65535), var1);
   }
}
