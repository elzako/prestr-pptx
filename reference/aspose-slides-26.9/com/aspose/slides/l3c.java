package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.ms.System.IDisposable;

class l3c extends a9x {
   private boolean k5 = false;
   private List<v5s> u3 = new List<>();
   private int a6 = 0;

   l3c(v5s var1) {
      super(var1);
      this.a6 = 0;
      if (this.e2() != null) {
         this.a6 = this.e2().a6 + 1;
      } else {
         this.k5 = true;
      }
   }

   final boolean n5() {
      if (this.l6 != null) {
         return false;
      }

      if (!this.k5) {
         throw new InvalidDataException("The trying to initialize a non-root group-shape!");
      }

      BaseSlide var1 = this.y4().y4();
      var1.k5 = new GroupShape(var1);
      this.l6 = var1.k5;
      this.u3().n5(new LineFormat(this.u3()));
      this.u3().u3(1L);
      return true;
   }

   final void l6() {
      if (this.n5.z1()) {
         boolean var1 = false;
         List$Enumerator var2 = this.a6().iterator();

         try {
            for (; var2.hasNext(); var1 = true) {
               com.aspose.slides.internal.k0r.e6r var3 = (com.aspose.slides.internal.k0r.e6r)var2.next();
               if (var1) {
                  this.n5(var3);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.t2();
      }
   }

   private void n5(com.aspose.slides.internal.k0r.e6r var1) {
      com.aspose.slides.internal.k0r.g6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k0r.g6.class);
      if (var2 != null) {
         v5s var3 = new v5s(var2, this);
         l3c var4 = com.aspose.slides.internal.v6g.k5.n5(var3.a6(), l3c.class);
         if (var4 == null) {
            var3.a6().t2();
         } else {
            var4.l6();
         }
      }
   }

   final com.aspose.slides.internal.k0r.e4 k5() {
      return (com.aspose.slides.internal.k0r.e4)this.n5.l6();
   }

   final GroupShape u3() {
      if (this.l6 == null) {
         this.s7();
      }

      return (GroupShape)this.l6;
   }

   final List<com.aspose.slides.internal.k0r.e6r> a6() {
      return this.k5().e2();
   }

   final List<v5s> u9() {
      return this.u3;
   }

   final ShapeCollection h0() {
      if (this.n5.c8() == 4) {
         return ((Table)this.l6).x9();
      } else {
         return this.n5.c8() == 7 ? ((LegacyDiagram)this.l6).x9() : ((GroupShape)this.l6).n5;
      }
   }
}
