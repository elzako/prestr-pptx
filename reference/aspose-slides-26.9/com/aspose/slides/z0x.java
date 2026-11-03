package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class z0x {
   public static void n5(IGradientFormatEffectiveData var0, i4v var1, OdpSerializationContext var2) {
      if (var0 == null) {
         throw new ArgumentNullException("gradientFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("fillFormatContext");
      }

      int var3 = var0.getGradientStops().size();
      boolean var4 = var3 > 0
         && (
            var3 > 2
                  && (
                     var3 != 3
                        || !com.aspose.slides.internal.o9b.c8.n5(
                           ((GradientStopEffectiveData)var0.getGradientStops().get_Item(0)).n5(),
                           ((GradientStopEffectiveData)var0.getGradientStops().get_Item(2)).n5()
                        )
                  )
               || var0.getGradientStops().get_Item(0).getPosition() != 0.0F
               || var0.getGradientStops().get_Item(var3 - 1).getPosition() != 1.0F
         );
      if (var4 && !var2.n3()) {
         var1.k5(3);
         int var36 = var0.getGradientShape() == 0 && var0.getLinearGradientAngle() % 180.0F == 0.0F ? 1 : 256;
         com.aspose.slides.internal.o9b.l6 var37 = new com.aspose.slides.internal.o9b.l6(256, var36);

         try {
            var37.n5(96.0F, 96.0F);
            com.aspose.slides.internal.o9b.z1 var38 = com.aspose.slides.internal.o9b.z1.n5(var37);

            try {
               var38.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
               ShapeFrame var39 = new ShapeFrame(0.0F, 0.0F, var37.e2(), var36, (byte)0, (byte)0, 0.0F);
               j5m var41 = new j5m(var39.cloneT(), new com.aspose.slides.internal.w0.c8(), null, var2.c8(), null);
               u4z var43 = new u4z(var41, (j0p)var0, false);
               com.aspose.slides.internal.o9b.u3 var44 = d4.k5(var43);

               try {
                  var38.n5(var44, 0, 0, var37.e2(), var37.h0());
               } finally {
                  if (var44 != null) {
                     var44.dispose();
                  }
               }
            } finally {
               if (var38 != null) {
                  var38.dispose();
               }
            }

            var1.n5(3);
            com.aspose.slides.internal.z0k.e2 var40 = new com.aspose.slides.internal.z0k.e2();

            try {
               var37.n5(var40, com.aspose.slides.internal.j9e.x8.s7());
               PPImage var42 = ((ImageCollection)var2.n5().getImages()).l6(var40.toArray());
               var2.n5(var1, var42);
            } finally {
               if (var40 != null) {
                  var40.dispose();
               }
            }
         } finally {
            if (var37 != null) {
               var37.dispose();
            }
         }
      } else {
         com.aspose.slides.internal.k4y.y1m var5 = var2.l6().u3();
         var1.k5(4);
         if (var3 != 0) {
            String var6 = com.aspose.slides.ms.System.d1.n5("Gradient{0}", new Object[]{var5.n5().size()});
            var1.t2(var6);
            com.aspose.slides.internal.k4y.a6y var7 = (com.aspose.slides.internal.k4y.a6y)var5.n5("gradient").l6();
            var7.l6(var6);
            var7.n5(var6);
            switch (var0.getGradientShape()) {
               case 0:
                  var7.n5(1);
                  break;
               case 1:
                  var7.n5(5);
                  break;
               case 2:
                  var7.n5(3);
                  break;
               case 3:
                  var7.n5(6);
            }

            IGradientStopEffectiveData var8 = var0.getLinearGradientAngle() == 90.0F
               ? var0.getGradientStops().get_Item(0)
               : var0.getGradientStops().get_Item(1);
            IGradientStopEffectiveData var9 = var0.getLinearGradientAngle() == 90.0F
               ? var0.getGradientStops().get_Item(1)
               : var0.getGradientStops().get_Item(0);
            if (var3 > 2) {
               if (var0.getGradientShape() == 0) {
                  var7.n5(2);
               }

               var7.h0(t2f.n5(((GradientStopEffectiveData)var8).n5().o8()));
               var7.c8(t2f.n5(((GradientStopEffectiveData)var9).n5().o8()));
               var7.u9(t2f.n5(50));
            } else {
               var7.h0(t2f.n5(((GradientStopEffectiveData)var8).n5().o8()));
               var7.c8(t2f.n5(((GradientStopEffectiveData)var9).n5().o8()));
               var7.u9(t2f.n5(com.aspose.slides.internal.v6g.k5.u3(100.0F - var0.getGradientStops().get_Item(1).getPosition() * 100.0F, 13)));
            }

            if (var0.getGradientShape() > 0) {
               switch (var0.getGradientDirection()) {
                  case 0:
                     var7.k5(t2f.n5(20));
                     var7.u3(t2f.n5(20));
                     break;
                  case 1:
                     var7.k5(t2f.n5(80));
                     var7.u3(t2f.n5(20));
                     break;
                  case 2:
                     var7.k5(t2f.n5(20));
                     var7.u3(t2f.n5(80));
                     break;
                  case 3:
                     var7.k5(t2f.n5(80));
                     var7.u3(t2f.n5(80));
                     break;
                  case 4:
                     var7.k5(t2f.n5(50));
                     var7.u3(t2f.n5(50));
                     break;
                  default:
                     var7.k5(t2f.n5(50));
                     var7.u3(t2f.n5(50));
               }
            }

            if (var0.getLinearGradientAngle() != 270.0F) {
               var7.a6(com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(270.0F + var0.getLinearGradientAngle(), 13) % 360 * 10));
            }

            if ((((GradientStopEffectiveData)var8).n5().s7() & 255) < 255 || (((GradientStopEffectiveData)var9).n5().s7() & 255) < 255) {
               var7.t2(
                  t2f.n5(
                     com.aspose.slides.internal.v6g.k5.u3(
                        com.aspose.slides.ms.System.q1.u3((((GradientStopEffectiveData)var8).n5().s7() & 255) * 100 / 255.0F), 14
                     )
                  )
               );
               var7.s7(
                  t2f.n5(
                     com.aspose.slides.internal.v6g.k5.u3(
                        com.aspose.slides.ms.System.q1.u3((((GradientStopEffectiveData)var9).n5().s7() & 255) * 100 / 255.0F), 14
                     )
                  )
               );
               String var10 = com.aspose.slides.ms.System.d1.n5("GradientOpacity{0}", new Object[]{var5.n5().size()});
               var1.c8(var10);
               com.aspose.slides.internal.k4y.k5d var11 = (com.aspose.slides.internal.k4y.k5d)var5.n5("opacity").l6();
               var11.l6(var10);
               var11.n5(var10);
               var11.n5(var7.l6());
               var11.k5(var7.t2());
               var11.u3(var7.s7());
            }
         }
      }
   }
}
