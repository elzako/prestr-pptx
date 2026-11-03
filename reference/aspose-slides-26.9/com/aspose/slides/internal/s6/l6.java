package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

class l6 {
   private List<k5> n5 = new List<>();
   private List<a6> l6 = new List<>();
   private p8 k5;

   public l6(p8 var1, float var2) {
      this.k5 = var1;
      long var3 = 0L;

      for (int var5 = 1; var5 < var1.u9(); var5++) {
         int var6 = var5 % (var1.u9() - 1);
         int var7 = var5 - 1;
         int var8 = var6 + 1;
         s0 var9 = s0.l6(var1.l6(var6).n5(), var1.l6(var7).n5()).u3().a6();
         s0 var10 = s0.l6(var1.l6(var8).n5(), var1.l6(var6).n5()).u3().a6();
         s0 var11 = s0.n5(var9, var10).u3().a6();
         s0 var12 = new s0(-var11.l6(), var11.n5());
         float var13 = -var9.n5() * var10.n5() + -var9.l6() * var10.l6();
         if (var13 == 1.0) {
            var13 = 0.0F;
         }

         float var14 = (float)q1.z3((1.0F - var13) / 2.0);
         float var15 = 1.0F / var14;
         k5 var16 = new k5(var3++, var1.l6(var6).n5().a6(), s0.n5(var1.l6(var6).n5(), s0.n5(s0.n5(var12, var2), var15)).a6(), var1.l6(var6).k5());
         this.n5.addItem(var16);
         a6 var17 = new a6();
         this.l6.addItem(var17);
         var16.n5(var17);
      }

      if (this.n5.get_Item(this.n5.size() - 1).u3() == 0) {
         this.n5.get_Item(this.n5.size() - 1).n5(var1.l6(var1.u9() - 1).k5());
      }
   }

   final void n5() {
      boolean var1;
      do {
         var1 = false;
         int var2 = this.n5.size();

         for (int var3 = 0; var3 < var2; var3++) {
            k5 var4 = this.n5.get_Item(var3);
            k5 var5 = this.n5.get_Item((var3 + 1) % var2);
            if (var4.c8() != var5.c8()) {
               s0 var6 = new s0();
               s0[] var7 = new s0[]{var6};
               boolean var8 = var4.n5(var5, var7);
               var7[0].n5(var6);
               if (var8) {
                  var4.c8().n5(var5.c8());
                  var1 = true;
               }
            }
         }

         List$Enumerator var25 = this.l6.iterator();

         try {
            while (var25.hasNext()) {
               a6 var27 = (a6)var25.next();
               var27.n5();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
               var25.dispose();
            }
         }
      } while (var1);

      List var24 = new List();
      List$Enumerator var26 = this.l6.iterator();

      try {
         while (var26.hasNext()) {
            a6 var28 = (a6)var26.next();
            if (!var28.k5()) {
               var24.addItem(var28);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
            var26.dispose();
         }
      }

      List$Enumerator var29 = var24.iterator();

      try {
         while (var29.hasNext()) {
            a6 var30 = (a6)var29.next();
            this.l6.removeItem(var30);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
            var29.dispose();
         }
      }
   }

   public final List<k5> l6() {
      return this.n5;
   }

   public final List<a6> k5() {
      return this.l6;
   }

   public final p8 u3() {
      return this.k5;
   }
}
