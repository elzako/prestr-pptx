package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class Ink extends GraphicalObject implements IInk {
   private List<h2i> n5 = new List<>();
   private r6s l6;
   private List<InkTrace> k5;
   private List<q8i> u3 = new List<>();
   private List<d1l> a6 = new List<>();
   private List<t7j> u9;
   private List<r3w> h0;
   private static Dictionary<Integer, IImage> e2 = new Dictionary<>();
   private com.aspose.slides.internal.k4y.c6 t9;

   @Override
   public final IInkTrace[] getTraces() {
      return this.n5(this.n5(), this.k5());
   }

   public static Dictionary<Integer, IImage> getInkEffectImages() {
      return e2;
   }

   final List<InkTrace> n5() {
      return this.k5;
   }

   final List<q8i> k5() {
      return this.u3;
   }

   final com.aspose.slides.internal.k4y.c6 u9() {
      return this.t9;
   }

   final void n5(com.aspose.slides.internal.k4y.c6 var1) {
      this.t9 = var1;
   }

   final List<h2i> x8() {
      return this.n5;
   }

   final r6s y4() {
      return this.l6;
   }

   final List<d1l> e2() {
      return this.a6;
   }

   final List<t7j> z1() {
      return this.u9;
   }

   final List<r3w> m3() {
      return this.h0;
   }

   Ink(ShapeCollection parentImmediate) {
      super(parentImmediate);
      this.k5 = new List<>();
      this.u9 = new List<>();
      this.h0 = new List<>();
      this.n5(new n1r(this));
   }

   private IInkTrace[] n5(List<InkTrace> var1, List<q8i> var2) {
      List var3 = new List();
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            InkTrace var5 = (InkTrace)var4.next();
            var3.addItem(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = var2.iterator();

      try {
         while (var14.hasNext()) {
            q8i var6 = (q8i)var14.next();
            var3.addRange(com.aspose.slides.ms.System.u3.n5(this.n5(var6.n5(), var6.l6())));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      return (IInkTrace[])var3.toArray(new IInkTrace[0]);
   }
}
