package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.ms.System.IDisposable;

abstract class e8s implements c0e {
   public final ReadOnlyCollection<e8s> h0;
   e8s c8;
   private y1m n5 = new y1m();
   private d2k l6 = new d2k();
   private boolean k5;
   public final IMathElement t2;
   private final a1w u3;
   List<e8s> s7 = new List<>();
   final e8s x8;

   public final y1m u9() {
      return this.n5.n5();
   }

   private void n5(y1m var1) {
      this.n5 = var1.n5();
   }

   public final d2k h0() {
      return this.l6.u3();
   }

   public final void l6(d2k var1) {
      this.l6 = var1.u3();
   }

   public final boolean c8() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   protected e8s(IMathElement var1, c0e var2) {
      this.h0 = new ReadOnlyCollection<>(this.s7);
      this.u3 = var2.a6();
      this.x8 = com.aspose.slides.internal.v6g.k5.n5(var2, e8s.class);
      this.t2 = var1;
      if (com.aspose.slides.internal.v6g.k5.l6(var2, e8s.class) && ((e8s)var2).h0.size() > 0) {
         this.c8 = ((e8s)var2).h0.get_Item(((e8s)var2).h0.size() - 1);
      }
   }

   final void t2() {
      if (this.x8 != null) {
         this.x8.s7.addItem(this);
      }
   }

   public void n5(v1l var1) {
      n5(var1.n5(), this.s7);
   }

   public static void n5(v1l var0, IGenericList<e8s> var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         e8s var3 = (e8s)var1.get_Item(var2);
         c6v var4 = new c6v(var0.n5);

         try {
            d2k var5 = var3.h0().u3();
            var0.n5.n5(var5.n5, var5.l6);
            var3.n5(var0.n5());
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      }
   }

   public final void k5(d2k var1) {
      List$Enumerator var2 = this.s7.iterator();

      try {
         while (var2.hasNext()) {
            e8s var3 = (e8s)var2.next();
            var3.l6(d2k.k5.u3());
            var3.k5(var1.u3());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.n5(this.n5(var1.u3()).n5());
   }

   protected abstract y1m n5(d2k var1);

   final void l6(float var1, float var2) {
      this.l6(new d2k(var1, var2));
   }

   protected final e8s n5(IMathElement var1, w1g var2) {
      return this.a6().n5(var1, this, var2.n5());
   }

   protected final com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.o9b.u3 var1) {
      for (e8s var2 = this; var2 != null; var2 = var2.x8) {
         IMathElement var3 = var2.t2;
         if (com.aspose.slides.internal.v6g.k5.l6(var3, q8r.class)) {
            s7u var4 = com.aspose.slides.internal.v6g.k5.n5(var3, q8r.class).getControlCharacterProperties();
            IPortionFormat var5 = null;
            if (var4.l6() != null) {
               var5 = var4.l6();
            }

            if (var5 != null) {
               IFillFormat var6 = var5.getFillFormat();
               if (var6 != null && var6.getFillType() == 1) {
                  return new com.aspose.slides.internal.o9b.i1(((ColorFormat)var6.getSolidFillColor()).u3().o8());
               }
            }
         }
      }

      return var1;
   }

   @Override
   public final a1w a6() {
      return this.u3;
   }
}
