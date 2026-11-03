package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NullReferenceException;

class y7i extends t4s {
   static void n5(v5s var0) {
      l7d var1 = (l7d)var0.a6();
      if (var1.n5() == null) {
         throw new InvalidDataException("No linked object for VideoFrame!");
      }

      VideoFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), VideoFrame.class);
      if (var2 == null) {
         throw new NullReferenceException("VideoFrame isn't created!");
      }

      k5(var0);
      com.aspose.slides.internal.k0r.c9 var3 = var0.k5().s7();
      com.aspose.slides.internal.k0r.n5 var4 = null;
      if (var3.u9() != null) {
         var4 = var3.u9().l6();
      }

      if (var4 != null) {
         var2.n5().n5(!var4.u3() ? 1 : 0);
      } else {
         var2.n5().n5(1);
      }

      com.aspose.slides.internal.k0r.r7 var5 = (com.aspose.slides.internal.k0r.r7)var1.n5();
      var2.setLinkPathLong(var5.u3() == null ? "" : var5.u3().l6());
      var2.z1 = var5.l6().k5();
      var2.setHyperlinkClick(Hyperlink.getMedia());
      var2.e2 = 2;
   }

   static void n5(VideoFrame var0, com.aspose.slides.internal.k0r.c5 var1, k1z var2) {
      com.aspose.slides.internal.k0r.q5 var3 = var2.z3();
      if (var3 != null) {
         com.aspose.slides.internal.k0r.d9 var4 = var1.l6();
         long var5 = var4.l6();
         var4.n5(var5 + 1L);
         com.aspose.slides.internal.k0r.y9 var7 = new com.aspose.slides.internal.k0r.y9(0);
         var1.e2().addItem(var7);
         com.aspose.slides.internal.k0r.r7 var8 = new com.aspose.slides.internal.k0r.r7(0);
         var7.e2().addItem(var8);
         com.aspose.slides.internal.k0r.u2 var9 = new com.aspose.slides.internal.k0r.u2();
         var9.n5(var5);
         var7.l6().e2().addItem(var9);
         var7.l6().n5(new com.aspose.slides.internal.k0r.z1(var0.getLinkPathLong(), (short)0));
      }
   }
}
