package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class k7 extends l6 {
   private int c8 = 0;
   private k7$n5 t2 = null;
   private List<com.aspose.slides.internal.d2.c8> s7 = new List<>();

   public final int m1() {
      return this.c8;
   }

   public final void t2(int var1) {
      this.c8 = var1;
   }

   public final int k7() {
      return this.t2 != null ? this.t2.l6 : 0;
   }

   public k7() {
   }

   public k7(int var1, int var2, int var3, int var4) {
      this.t2 = new k7$n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(l6 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.c8.class)) {
         this.n5((com.aspose.slides.internal.d2.c8)var1);
         ((com.aspose.slides.internal.d2.c8)var1).l6(this);
      }
   }

   public final void n5(com.aspose.slides.internal.d2.c8 var1) {
      this.s7.addItem(var1);
   }

   public final void l6(List<com.aspose.slides.internal.d2.c8> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.d2.c8 var3 = (com.aspose.slides.internal.d2.c8)var2.next();
            l6 var4 = var3.t4();
            if (var4 == null) {
               var3.l6(this);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.s7 = var1;
   }

   public final List<com.aspose.slides.internal.d2.c8> m3() {
      return this.s7;
   }

   public final int z8() {
      return this.u9(27) ? this.c8(27) : 0;
   }

   public final int j5() {
      return this.u9(28) ? this.c8(28) : 0;
   }

   public final void w1() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;

      for (int var4 = this.s7.size(); var3 < var4; var3++) {
         var1 = q1.n5(var1, this.s7.get_Item(var3).f_());
         var2 += this.s7.get_Item(var3).a6();
      }

      this.l6(var1);
      this.k5(var2);
   }

   public final void s7(int var1) {
      int var2 = this.z8();
      int var3 = this.j5();
      switch (this.t2.n5) {
         case 23:
            this.n5(27, var2 - var1 / 2);
            this.n5(28, var3 - var1 / 2);
            break;
         case 39:
            this.n5(27, var2 - var1);
            break;
         case 70:
            this.t2.a6 = this.t2.a6 * ((float)(this.t2.l6 - var1) / this.t2.l6);
            this.t2.l6 -= var1;
            if (this.t2.u9) {
               this.r4();
            }
            break;
         case 135:
            this.n5(28, var3 - var1);
            break;
         default:
            throw new Exception();
      }
   }

   public final void r4() {
      if (this.t2.n5 == 70) {
         boolean var1 = false;
         int var2 = 0;

         for (int var3 = this.s7.size(); var2 < var3; var2++) {
            var1 |= this.s7.get_Item(var2).n5(this.t2.a6, this.t2.k5, this.t2.u3);
         }

         if (!var1) {
            this.t2 = null;
         } else {
            if (!this.t2.u9) {
               this.t2.u9 = true;
            }

            this.t2.a6 = 1.0;
         }
      }
   }

   @Override
   public p8 n5(boolean var1) {
      p8 var2 = p8.n5.u3();
      if (this.s7 != null) {
         List$Enumerator var3 = this.s7.iterator();

         try {
            while (var3.hasNext()) {
               l6 var4 = (l6)var3.next();
               p8 var5 = var4.n5(var1).u3();
               var2.n5(var2.l6() + var5.l6());
               var2.l6(q1.n5(var5.k5(), var2.k5()));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      if (this.u9(21)) {
         var2.n5(var2.l6() + (Integer)this.a6(21));
      }

      return var2;
   }
}
