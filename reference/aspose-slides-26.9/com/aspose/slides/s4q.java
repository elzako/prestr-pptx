package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;

class s4q {
   static void n5(PictureFillFormat var0, long var1, a9x var3) {
      com.aspose.slides.internal.k0r.q5 var4 = var3.n3();
      com.aspose.slides.internal.k0r.w8 var5 = var4.a6() != null ? var4.a6().l6() : new com.aspose.slides.internal.k0r.w8();
      short var6;
      short var7;
      short var8;
      if (com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), Control.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), OleObjectFrame.class)) {
         var6 = 260;
         var7 = 261;
         var8 = 262;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), PictureFrame.class)) {
         var6 = 260;
         var7 = 261;
         var8 = 262;
      } else {
         var6 = 390;
         var7 = 391;
         var8 = 392;
      }

      j4t.n5(var0.getPicture(), var6, var7, var8, var3);
      if (com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), PictureFrame.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), Control.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), OleObjectFrame.class)) {
         i2h var9 = new i2h(0.0F, 0.0F, 0.0F, 0.0F);
         com.aspose.slides.internal.k0r.z5 var10 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(256), com.aspose.slides.internal.k0r.z5.class);
         var9.k5 = var10 != null ? (float)com.aspose.slides.internal.n8e.y2.n5(var10.j5()) * 100.0F : 0.0F;
         com.aspose.slides.internal.k0r.z5 var11 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(257), com.aspose.slides.internal.k0r.z5.class);
         var9.a6 = var11 != null ? (float)com.aspose.slides.internal.n8e.y2.n5(var11.j5()) * 100.0F : 0.0F;
         com.aspose.slides.internal.k0r.z5 var12 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(258), com.aspose.slides.internal.k0r.z5.class);
         var9.l6 = var12 != null ? (float)com.aspose.slides.internal.n8e.y2.n5(var12.j5()) * 100.0F : 0.0F;
         com.aspose.slides.internal.k0r.z5 var13 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(259), com.aspose.slides.internal.k0r.z5.class);
         var9.u3 = var13 != null ? (float)com.aspose.slides.internal.n8e.y2.n5(var13.j5()) * 100.0F : 0.0F;
         var0.n5(var9.k5());
      }

      if ((var1 & 4294967295L) == 2L) {
         var0.setPictureFillMode(0);
      } else if ((var1 & 4294967295L) == 3L) {
         var0.setPictureFillMode(1);
      } else if (var1 != 4294967295L) {
         throw new Exception();
      }
   }

   static void n5(PictureFillFormat var0, com.aspose.slides.internal.k0r.r3 var1, g6o var2) {
      if (var0 == null) {
         throw new ArgumentNullException("pictureFillFormat");
      }

      var1.l6().k5(384);
      if (!com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), Control.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), OleObjectFrame.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), PictureFrame.class)) {
         switch (var0.getPictureFillMode()) {
            case 0:
               var1.l6().l6(new com.aspose.slides.internal.k0r.z5(384, 2L));
               break;
            case 1:
               var1.l6().l6(new com.aspose.slides.internal.k0r.z5(384, 3L));
               break;
            default:
               throw new Exception();
         }
      }

      short var3;
      short var4;
      short var5;
      if (com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), PictureFrame.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), OleObjectFrame.class)) {
         var3 = 260;
         var4 = 261;
         var5 = 262;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), Control.class)) {
         var3 = 260;
         var4 = 261;
         var5 = 262;
      } else {
         var3 = 390;
         var4 = 391;
         var5 = 392;
      }

      j4t.n5(var0.getPicture(), var1, var3, var4, var5, var2);
      if (com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), Control.class)) {
         var1.l6().k5(319);
         com.aspose.slides.internal.k0r.w2 var6 = new com.aspose.slides.internal.k0r.w2();
         var6.n5(true);
         var6.k5(true);
         var1.l6().n5(var6);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), OleObjectFrame.class)) {
         OleObjectFrame var14 = (OleObjectFrame)var0.getParent_Immediate();
         if (com.aspose.slides.ms.System.o5.l6(var14.y4().s7(), null) && var1.l6().n5(267) == null) {
            com.aspose.slides.internal.k0r.z5 var7 = new com.aspose.slides.internal.k0r.z5(267, false, var14.y4().s7().n5());
            var1.l6().n5(var7);
         }
      }

      var1.l6().k5(258);
      var1.l6().k5(256);
      var1.l6().k5(259);
      var1.l6().k5(257);
      l6g var8 = var0.h0();
      if (c1t.l6(var8.l6().u3().l6())) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), PictureFrame.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), Control.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var0.getParent_Immediate(), OleObjectFrame.class)) {
            throw new NotImplementedException();
         }

         i2h var9 = var0.u3().k5();
         if (com.aspose.slides.ms.System.q1.n5(var9.l6) > 0.001) {
            com.aspose.slides.internal.k0r.z5 var10 = new com.aspose.slides.internal.k0r.z5(258, com.aspose.slides.internal.n8e.y2.n5(var9.l6 / 100.0F));
            var1.l6().n5(var10);
         }

         if (com.aspose.slides.ms.System.q1.n5(var9.k5) > 0.001) {
            com.aspose.slides.internal.k0r.z5 var11 = new com.aspose.slides.internal.k0r.z5(256, com.aspose.slides.internal.n8e.y2.n5(var9.k5 / 100.0F));
            var1.l6().n5(var11);
         }

         if (com.aspose.slides.ms.System.q1.n5(var9.u3) > 0.001) {
            com.aspose.slides.internal.k0r.z5 var12 = new com.aspose.slides.internal.k0r.z5(259, com.aspose.slides.internal.n8e.y2.n5(var9.u3 / 100.0F));
            var1.l6().n5(var12);
         }

         if (com.aspose.slides.ms.System.q1.n5(var9.a6) > 0.001) {
            com.aspose.slides.internal.k0r.z5 var13 = new com.aspose.slides.internal.k0r.z5(257, com.aspose.slides.internal.n8e.y2.n5(var9.a6 / 100.0F));
            var1.l6().n5(var13);
         }
      }
   }
}
