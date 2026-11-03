package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class w1 extends x0q {
   final void n5(IControl var1) {
      this.n5();
      Control var2 = com.aspose.slides.internal.v6g.k5.n5(var1, Control.class);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "http://schemas.microsoft.com/office/2006/activeX".equals(this.s7().y4()) && "ocx".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.n5 var3 = new com.aspose.slides.internal.k4y.n5(this.s7());
            u3r var4 = var2.n5();
            if (var3.a6() > -1) {
               var2.n5(var3.a6());
            }

            var2.n5(new com.aspose.slides.ms.System.o0(var3.l6()));
            if (var2.getPersistence() == 0) {
               for (com.aspose.slides.internal.k4y.k7m var8 : var3.u9()) {
                  com.aspose.slides.internal.k4y.g7 var9 = var8.k5();
                  if (var8.l6() == null && var9 != null) {
                     if (com.aspose.slides.internal.v6g.k5.l6(var9.l6(), com.aspose.slides.internal.k4y.v6s.class)) {
                        com.aspose.slides.internal.k4y.v6s var10 = (com.aspose.slides.internal.k4y.v6s)var9.l6();
                        if (var10 == null || var10.l6() != 0 || !"font".equals(var9.n5())) {
                           continue;
                        }

                        var4.n5(new ControlPropertiesCollection());

                        for (com.aspose.slides.internal.k4y.k7m var14 : var10.k5()) {
                           var4.u3().add(var14.n5(), var14.l6());
                        }
                     }

                     if (com.aspose.slides.internal.v6g.k5.l6(var9.l6(), com.aspose.slides.internal.k4y.f2i.class)) {
                        com.aspose.slides.internal.k4y.f2i var16 = (com.aspose.slides.internal.k4y.f2i)var9.l6();
                        if (var16 != null && "picture".equals(var9.n5()) && var16.n5() != null) {
                           com.aspose.slides.internal.c8m.j8 var17 = this.k5().k7().n5(var16.n5()).l6();
                           var4.n5(var17.a6());
                           var17.n5(true);
                        }
                     }
                  } else {
                     var2.getProperties().add(var8.n5(), var8.l6());
                  }
               }
            }

            var4.n5(var3.k5());
            if (var3.u3() != null) {
               com.aspose.slides.internal.c8m.j8 var15 = this.k5().k7().n5(var3.u3()).l6();
               if (this.k5().t9().a6().getDeleteEmbeddedBinaryObjects()) {
                  var2.n5(new byte[0]);
               } else {
                  var2.n5(var15.a6());
               }

               var15.n5(true);
            }
         }
      }

      this.n3();
   }

   final void l6(IControl var1) {
      this.y4();
      com.aspose.slides.internal.k4y.n5 var2 = new com.aspose.slides.internal.k4y.n5();
      this.n5(var1, var2);
      if (var1.getProperties() != null) {
         IGenericEnumerator var3 = var1.getProperties().getNamesOfProperties().iterator();

         try {
            while (var3.hasNext()) {
               String var4 = (String)var3.next();
               com.aspose.slides.internal.k4y.k7m var5 = var2.n5();
               var5.l6(var4);
               var5.k5(var1.getProperties().get_Item(var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      var2.n5(null, this.x8(), "ocx");
      this.e2();
   }

   private void n5(IControl var1, com.aspose.slides.internal.k4y.n5 var2) {
      u3r var3 = ((Control)var1).n5();
      var2.n5(((Control)var1).getPersistence());
      var2.l6(var3.n5());
      if (((Control)var1).getActiveXControlBinary() != null) {
         com.aspose.slides.internal.c8m.j8 var4 = this.u3()
            .a6()
            .n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/activeX/activeX", com.aspose.slides.ms.System.a3.l6(this.u3().j5()), ".bin"}),
               null,
               new com.aspose.slides.internal.c8m.n5()
            );
         var4.n5(((Control)var1).getActiveXControlBinary());
         com.aspose.slides.internal.c8m.r7 var5 = this.u3().u6().l6(var4);
         var2.k5(var5.a6());
      }

      var2.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"{", var1.getClassId(), "}"}));
      if (var3.u3() != null) {
         com.aspose.slides.internal.k4y.k7m var12 = var2.n5();
         var12.l6("font");
         com.aspose.slides.internal.k4y.v6s var14 = (com.aspose.slides.internal.k4y.v6s)var12.n5("font").l6();
         var14.n5(0);
         IGenericEnumerator var6 = var3.u3().getNamesOfProperties().iterator();

         try {
            while (var6.hasNext()) {
               String var7 = (String)var6.next();
               com.aspose.slides.internal.k4y.k7m var8 = var14.n5();
               var8.l6(var7);
               var8.k5(var3.u3().get_Item(var7));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      if (var3.a6() != null) {
         com.aspose.slides.internal.k4y.k7m var13 = var2.n5();
         var13.l6("picture");
         com.aspose.slides.internal.k4y.f2i var15 = (com.aspose.slides.internal.k4y.f2i)var13.n5("picture").l6();
         com.aspose.slides.internal.c8m.j8 var16 = this.u3()
            .a6()
            .n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/activeX/activeX", com.aspose.slides.ms.System.a3.l6(this.u3().j5()), ".bin"}),
               null,
               new com.aspose.slides.internal.c8m.n5()
            );
         var16.n5(var3.a6());
         com.aspose.slides.internal.c8m.r7 var17 = this.u3().u6().l6(var16);
         var15.n5(var17.a6());
      }
   }

   public w1(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public w1(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
