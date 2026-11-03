package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.XmlException;

class c5i {
   public static void n5(IControl var0, com.aspose.slides.internal.k4y.k5 var1, i1x var2) {
      com.aspose.slides.internal.k4y.z9c var3;
      if (com.aspose.slides.internal.n8e.f0.n5.n5("urn:schemas-microsoft-com:vml") && var1.u3() != null) {
         var3 = var1.u3();
      } else {
         var3 = var1.k5();
      }

      u3r var4 = ((Control)var0).n5();
      t5w var5 = var2.n5();
      String var6 = var3.l6();
      if (!com.aspose.slides.ms.System.d1.n5(var6)) {
         var2.n5(var6, var0);
      }

      var0.setName(var3.k5());
      var4.n5(var3.u3());
      String var7 = var3.a6();
      if (!com.aspose.slides.ms.System.d1.n5(var7)) {
         com.aspose.slides.internal.c8m.j8 var8 = var5.k7().n5(var7).l6();
         w1 var9 = new w1(var8, var5);

         try {
            var9.n5(var0);
         } catch (XmlException var17) {
            var2.n5().n5(com.aspose.slides.ms.System.d1.n5(new String[]{var8.l6(), " is not valid ActiveX control: ", var17.getMessage()}), 1);
         }
      }

      if (var3.c8() != null && var3.c8().l6() != null) {
         com.aspose.slides.internal.k4y.n7n var18 = var3.c8().l6();
         com.aspose.slides.internal.k4y.e3 var19 = var18.l6();
         k8n.n5((PictureFillFormat)var0.getSubstitutePictureFormat(), var19, var5);
         com.aspose.slides.internal.k4y.b9y var10 = var18.k5();
         if (var10 != null) {
            e4c var11 = e4c.k5.u9();
            e4c var12 = e4c.k5.u9();
            x4t var13 = x4t.n5.n5();
            if (var10.u9() != null) {
               e4c[] var14 = new e4c[]{var11};
               e4c[] var15 = new e4c[]{var12};
               x4t[] var16 = new x4t[]{var13};
               z5b.n5(var10.u9(), var14, var15, var16);
               var14[0].l6(var11);
               var15[0].l6(var12);
               var16[0].n5(var13);
            }

            var0.setFrame(
               new ShapeFrame((float)var11.n5, (float)var11.l6, (float)var12.n5, (float)var12.l6, (byte)(var13.u3 ? 1 : 0), (byte)(var13.k5 ? 1 : 0), var13.l6)
            );
         }
      }

      var4.l6(var3.h0());
      var4.n5(var3.u9());
   }

   public static void n5(IControl var0, com.aspose.slides.internal.k4y.k5 var1, n4i var2) {
      u3r var3 = ((Control)var0).n5();
      g6c var4 = var2.n5();
      com.aspose.slides.internal.c8m.r7 var5 = null;
      if (((Control)var0).getActiveXControlBinary() != null
         || var0.getProperties() != null && var0.getProperties().getCount() > 0
         || com.aspose.slides.ms.System.o0.l6(((Control)var0).k5(), com.aspose.slides.ms.System.o0.n5)) {
         com.aspose.slides.internal.c8m.j8 var6 = var4.a6().n5("/ppt/activeX/activeX{0}.xml", new c5i$1(var4), new com.aspose.slides.internal.c8m.l6());
         w1 var7 = new w1(var6, var4);
         var7.l6(var0);
         var5 = var4.u6().l6(var6);
      }

      if (n5()) {
         com.aspose.slides.internal.k4y.z9c var10 = var1.l6();
         var10.l6(var0.getName());
         var10.l6(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var3.k5() * 12700.0), 14));
         var10.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var3.l6() * 12700.0), 14));
         if (var5 == null) {
            throw new NullReferenceException("ActiveX couldn't be empty.");
         }

         var10.k5(var5.a6());
         var10.n5(com.aspose.slides.ms.System.a3.n5(var2.n5(var0), "D4"));
      }

      com.aspose.slides.internal.k4y.z9c var11 = var1.n5();
      var11.l6(var0.getName());
      var11.l6(var3.k5());
      var11.n5(var3.l6());
      var11.k5(var5.a6());
      com.aspose.slides.internal.k4y.n7n var12 = var11.n5().n5();
      var12.n5().n5().n5(0L);
      var12.n5().n5().n5(var0.getName());
      var12.n5().l6().n5().t2(true);
      var12.n5().l6().k5().s7(true);
      k8n.n5((PictureFillFormat)var0.getSubstitutePictureFormat(), var12.l6(), var4);
      com.aspose.slides.internal.k4y.b9y var8 = var12.k5();
      z5b.n5(var0.getFrame(), var8.n5());
      com.aspose.slides.internal.k4y.r7n var9 = (com.aspose.slides.internal.k4y.r7n)var8.k5("prstGeom").l6();
      var9.n5(5);
      var8.l6("noFill");
      var8.l6();
   }

   private static boolean n5() {
      return true;
   }
}
