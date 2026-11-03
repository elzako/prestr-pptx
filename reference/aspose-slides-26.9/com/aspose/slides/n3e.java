package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class n3e extends n8 {
   final void n5(INotesSlide var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1) {
            if (!"notes".equals(this.s7().n3())) {
               if ("AlternateContent".equals(this.s7().n3())) {
                  while (this.s7().u9()) {
                     if ("Choice".equals(this.s7().n3())) {
                        com.aspose.slides.internal.k4y.w1j var8 = new com.aspose.slides.internal.k4y.w1j(this.s7());
                        List$Enumerator var3 = var8.n5().iterator();

                        try {
                           while (var3.hasNext()) {
                              com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
                              if ("notes".equals(var4.n5())) {
                                 this.n5((com.aspose.slides.internal.k4y.i9)var4.l6(), var1);
                                 return;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                              var3.dispose();
                           }
                        }
                     }
                  }
               }
            } else {
               com.aspose.slides.internal.k4y.i9 var2 = new com.aspose.slides.internal.k4y.i9(this.s7());
               this.n5(var2, var1);
            }
         }
      }

      this.n3();
   }

   private void n5(com.aspose.slides.internal.k4y.i9 var1, INotesSlide var2) {
      a1g.n5(var2.getThemeManager(), var1.a6());
      k3.n5(var2.getThemeManager(), this.k5());
      k2.n5(var2, var1.u3(), this.n5());
      this.z1();
      var2.setShowMasterShapes(var1.l6());
      this.n5(var2, var1);
   }

   private void z1() {
   }

   private void n5(INotesSlide var1, com.aspose.slides.internal.k4y.i9 var2) {
      d7r var3 = ((NotesSlide)var1).q0();
      var3.u3(var2.u9());
      var3.n5(var2.k5());
   }

   final void l6(INotesSlide var1) {
      this.y4();
      com.aspose.slides.internal.k4y.i9 var2 = new com.aspose.slides.internal.k4y.i9();
      this.u3().k5().addItem(var1, this.t9());
      k2.n5(var1, var2.u3(), this.l6());
      a1g.l6(((BaseThemeManager)var1.getThemeManager()).u3(), var2.n5());
      var2.n5(var1.getShowMasterShapes());
      this.l6(var1, var2);
      var2.n5(null, this.x8(), "notes");
      this.e2();
   }

   private void l6(INotesSlide var1, com.aspose.slides.internal.k4y.i9 var2) {
      d7r var3 = ((NotesSlide)var1).q0();
      var2.n5(var3.t2());
      var2.l6(var3.c8());
   }

   public n3e(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public n3e(com.aspose.slides.internal.c8m.j8 var1, g6c var2, IBaseSlide var3) {
      super(var1, var2, var3);
   }
}
