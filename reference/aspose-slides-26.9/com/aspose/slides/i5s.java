package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class i5s {
   private com.aspose.slides.internal.k4y.m4n n5;
   private final IGenericList<com.aspose.slides.internal.k4y.u9t> l6 = new List<>();
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.j4k> k5 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.y2i> u3 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.m3i> a6 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.s1v> u9 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.x2k> h0 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.r9i> c8 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.a6y> t2 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.k5d> s7 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.x7t> x8 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.q9k> n3 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.v1p> y4 = new x1s<>(new Dictionary<>());
   private final IGenericDictionary<String, com.aspose.slides.internal.k4y.r5v> e2 = new x1s<>(new Dictionary<>());

   public i5s(com.aspose.slides.internal.k4y.y1m var1, com.aspose.slides.internal.k4y.e1u var2, com.aspose.slides.internal.k4y.o5r var3) {
      if (var1 != null) {
         this.n5(var1);
      }

      if (var2 != null) {
         this.n5(var2);
      }

      if (var3 != null) {
         this.n5(var3);
      }
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.j4k> n5() {
      return this.k5;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.s1v> l6() {
      return this.u9;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.m3i> k5() {
      return this.a6;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.x2k> u3() {
      return this.h0;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.r9i> a6() {
      return this.c8;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.a6y> u9() {
      return this.t2;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.k5d> h0() {
      return this.s7;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.x7t> c8() {
      return this.x8;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.y2i> t2() {
      return this.u3;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.q9k> s7() {
      return this.n3;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.v1p> x8() {
      return this.y4;
   }

   public final IGenericDictionary<String, com.aspose.slides.internal.k4y.r5v> n3() {
      return this.e2;
   }

   public final IGenericList<com.aspose.slides.internal.k4y.u9t> y4() {
      return this.l6;
   }

   public final com.aspose.slides.internal.k4y.m4n e2() {
      return this.n5;
   }

   private void n5(com.aspose.slides.internal.k4y.o5r var1) {
      if (var1 == null) {
         throw new ArgumentNullException("masterStylesElementData");
      }

      List$Enumerator var2 = var1.n5().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            t2f.n5(com.aspose.slides.internal.k4y.u9t.class, this.l6, "master-page", var3, new i5s$1(this));
            if ("layer-set".equals(var3.n5())) {
               com.aspose.slides.internal.k4y.g6b var4 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k4y.g6b.class);
               if (var4 != null) {
                  for (com.aspose.slides.internal.k4y.v1p var8 : var4.n5()) {
                     if (!this.y4.containsKey(var8.n5())) {
                        this.y4.addItem(var8.n5(), var8);
                     }
                  }
               }
            }

            if ("handout-master".equals(var3.n5())) {
               com.aspose.slides.internal.k4y.m4n var12 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k4y.m4n.class);
               if (var12 != null) {
                  this.n5 = var12;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.k4y.y1m var1) {
      List$Enumerator var2 = var1.n5().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            t2f.n5(com.aspose.slides.internal.k4y.y2i.class, this.u3, "style", var3, new i5s$5(this));
            t2f.n5(com.aspose.slides.internal.k4y.m3i.class, this.a6, "default-style", var3, new i5s$6(this));
            t2f.n5(com.aspose.slides.internal.k4y.s1v.class, this.u9, "marker", var3, new i5s$7(this));
            t2f.n5(com.aspose.slides.internal.k4y.x2k.class, this.h0, "stroke-dash", var3, new i5s$8(this));
            t2f.n5(com.aspose.slides.internal.k4y.r9i.class, this.c8, "fill-image", var3, new i5s$9(this));
            t2f.n5(com.aspose.slides.internal.k4y.a6y.class, this.t2, "gradient", var3, new i5s$10(this));
            t2f.n5(com.aspose.slides.internal.k4y.k5d.class, this.s7, "opacity", var3, new i5s$11(this));
            t2f.n5(com.aspose.slides.internal.k4y.x7t.class, this.x8, "hatch", var3, new i5s$12(this));
            t2f.n5(com.aspose.slides.internal.k4y.q9k.class, this.n3, "presentation-page-layout", var3, new i5s$2(this));
            t2f.n5(com.aspose.slides.internal.k4y.r5v.class, this.e2, "table-template", var3, new i5s$3(this));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.k4y.e1u var1) {
      List$Enumerator var2 = var1.n5().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            t2f.n5(com.aspose.slides.internal.k4y.j4k.class, this.k5, "page-layout", var3, new i5s$4(this));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
