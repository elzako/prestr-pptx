package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.k4y.a9d;
import com.aspose.slides.internal.k4y.j1n;
import com.aspose.slides.ms.System.IDisposable;

class d1t extends com.aspose.slides.internal.c8m.w2 {
   final void n5(IDocumentProperties var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1
            && "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties".equals(this.s7().y4())
            && "Properties".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.o0 var2 = new com.aspose.slides.internal.k4y.o0(this.s7());
            DocumentProperties var3 = (DocumentProperties)var1;
            var3.setNameOfApplication(var2.m1());
            var3.setCompany(var2.a6());
            var3.setManager(var2.u3());
            var3.setPresentationFormat(var2.h0());
            var3.setSharedDoc(var2.t4() == 1);
            var3.setApplicationTemplate(var2.k5());
            var3.n5(com.aspose.slides.ms.System.s4.k5(var2.x8() & 4294967295L).n3());
            var3.setHyperlinkBase(var2.q0());
            var3.n5(var2.k7());
            var3.setScaleCrop(var2.y4() == 1);
            var3.setLinksUpToDate(var2.z1() == 1);
            var3.setHyperlinksChanged(var2.z3() == 1);
            var3.n5(var2.t2());
            var3.l6(var2.n3());
            var3.k5(var2.s7());
            var3.u3(var2.c8());
            var3.a6(var2.u9());
            List var4 = new List();
            com.aspose.slides.internal.k4y.c8t var5 = var2.t9();
            if (var5 != null) {
               List$Enumerator var6 = var5.n5().l6().iterator();

               try {
                  while (var6.hasNext()) {
                     com.aspose.slides.internal.k4y.g7 var7 = (com.aspose.slides.internal.k4y.g7)var6.next();
                     var4.addItem(var7.k5().toString());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }

            var3.n5((String[])var4.toArray(new String[0]));
            var3.n5(n5(var2));
         }
      }

      this.n3();
   }

   private static IHeadingPair[] n5(com.aspose.slides.internal.k4y.o0 var0) {
      List var1 = new List();
      com.aspose.slides.internal.k4y.c6s var2 = var0 != null ? var0.e2() : null;
      if (var2 != null && var2.n5() != null && var2.n5().l6() != null) {
         List var3 = var2.n5().l6();
         if (var3.size() < 2) {
            return (IHeadingPair[])var1.toArray(new IHeadingPair[0]);
         }

         for (int var4 = 0; var4 < var3.size() - 1; var4++) {
            com.aspose.slides.internal.k4y.g7 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.get_Item(var4), com.aspose.slides.internal.k4y.g7.class);
            com.aspose.slides.internal.k4y.g7 var6 = com.aspose.slides.internal.v6g.k5.n5(var3.get_Item(var4 + 1), com.aspose.slides.internal.k4y.g7.class);
            if (var5 != null && var6 != null) {
               String var7 = null;
               int var8 = 0;
               String[] var9 = new String[]{var7};
               int[] var10 = new int[]{0};
               boolean var11 = n5(var5.k5(), var9) && n5(var6.k5(), var10);
               var7 = var9[0];
               var8 = var10[0];
               if (var11) {
                  if (!com.aspose.slides.ms.System.d1.n5(var7)) {
                     var1.addItem(new HeadingPair(var7, var8));
                  }

                  var4++;
               }
            }
         }

         return (IHeadingPair[])var1.toArray(new IHeadingPair[0]);
      } else {
         return (IHeadingPair[])var1.toArray(new IHeadingPair[0]);
      }
   }

   private static boolean n5(Object var0, String[] var1) {
      var1[0] = null;
      a9d var2 = com.aspose.slides.internal.v6g.k5.n5(var0, a9d.class);
      if (var2 == null) {
         return false;
      }

      Object var3 = n5(var2);
      String var4 = com.aspose.slides.internal.v6g.k5.n5(var3, String.class);
      if (var4 == null) {
         return false;
      }

      var1[0] = var4;
      return true;
   }

   private static boolean n5(Object var0, int[] var1) {
      var1[0] = 0;
      a9d var2 = com.aspose.slides.internal.v6g.k5.n5(var0, a9d.class);
      if (var2 == null) {
         return false;
      } else {
         Object var3 = n5(var2);
         if (var3 == null) {
            return false;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, Integer.class)) {
            var1[0] = com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
            return true;
         } else {
            return false;
         }
      }
   }

   private static Object n5(a9d var0) {
      Object var1 = var0;

      while (com.aspose.slides.internal.v6g.k5.l6(var1, a9d.class)) {
         a9d var2 = (a9d)var1;
         if (var2.n5() == null) {
            return null;
         }

         var1 = var2.n5().k5();
      }

      return var1;
   }

   final void n5(IDocumentProperties var1, IPresentation var2) {
      this.y4();
      com.aspose.slides.internal.k4y.o0 var3 = new com.aspose.slides.internal.k4y.o0();
      DocumentProperties var4 = (DocumentProperties)var1;
      var3.u9(com.aspose.slides.ms.System.d1.l6("Aspose.Slides for Java"));
      String[] var5 = com.aspose.slides.ms.System.d1.n5("26.9", '.');
      var3.h0(com.aspose.slides.ms.System.d1.n5("{0:00}.{1:00}{2:00}", 26, 9, var5.length > 2 ? com.aspose.slides.ms.System.a3.n5(var5[2]) : 0));
      var3.k5(var4.getCompany());
      var3.l6(var1.getManager());
      var3.u3(var4.getPresentationFormat());
      var3.k5((byte)(var4.getSharedDoc() ? 1 : 0));
      var3.n5(var4.getApplicationTemplate());
      var3.n5(com.aspose.slides.internal.v6g.k5.a6(var4.n5().c8(), 14));
      var3.a6(var4.getHyperlinkBase());
      var3.n5((byte)(var4.getScaleCrop() ? 1 : 0));
      var3.l6((byte)(var4.getLinksUpToDate() ? 1 : 0));
      var3.u3((byte)(var4.getHyperlinksChanged() ? 1 : 0));
      if (var2 != null) {
         if (var2.getSlideSize().getType() != 6) {
            var3.u3(n5(var2.getSlideSize().getType()));
         }

         b8k var6 = new b8k(var2);
         var3.l6(var6.l6());
         var3.k5(var6.k5());
         var3.u3(var6.n5());
         var3.n5(var6.u3());
         var3.a6(var6.a6());
         com.aspose.slides.internal.k4y.c6s var7 = var3.n5();
         j1n var8 = var7.n5();
         var8.n5(0L);
         var8.n5(1);
         this.n5(var8, "Fonts Used", var6.u9().size());
         this.n5(var8, "Theme", 1);
         this.n5(var8, "Slide Titles", var6.h0().size());
         com.aspose.slides.internal.k4y.c8t var9 = var3.l6();
         var8 = var9.n5();
         var8.n5(12);
         var8.n5(0L);
         List$Enumerator var10 = var6.u9().iterator();

         try {
            while (var10.hasNext()) {
               String var11 = (String)var10.next();
               this.n5(var8, var11);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         this.n5(var8, var2.getMasterTheme().getName());
         List$Enumerator var21 = var6.h0().iterator();

         try {
            while (var21.hasNext()) {
               String var12 = (String)var21.next();
               this.n5(var8, var12);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
               var21.dispose();
            }
         }
      }

      var3.n5(null, this.x8(), "Properties");
      this.e2();
   }

   private void n5(j1n var1, String var2) {
      var1.n5(new com.aspose.slides.internal.k4y.g7("lpstr", var2));
      var1.n5(var1.n5() + 1L);
   }

   private void n5(j1n var1, String var2, int var3) {
      a9d var4 = (a9d)var1.n5("variant").l6();
      var4.n5("lpstr").n5(var2);
      var4 = (a9d)var1.n5("variant").l6();
      var4.n5("i4").n5(var3);
      var1.n5((var1.n5() & 4294967295L) + 2L & 4294967295L);
   }

   final void l6(IDocumentProperties var1, IPresentation var2) {
      this.t9().n3();
      this.n5(var1, var2);
   }

   private static String n5(int var0) {
      switch (var0) {
         case 0:
            return "On-screen Show (4:3)";
         case 1:
            return "Letter Paper (8.5x11 in)";
         case 2:
            return "A4 Paper (210x297 mm)";
         case 3:
            return "35mm Slides";
         case 4:
            return "Overhead";
         case 5:
            return "Banner";
         case 6:
         default:
            return "Custom";
         case 7:
            return "Ledger Paper (11x17 in)";
         case 8:
            return "A3 Paper (297x420 mm)";
         case 9:
            return "B4 (ISO) Paper (250x353 mm)";
         case 10:
            return "B5 (ISO) Paper (176x250 mm)";
         case 11:
            return "B4 (JIS) Paper (257x364 mm)";
         case 12:
            return "B5 (JIS) Paper (182x257 mm)";
         case 13:
            return "HagakiCard (4x6 in)";
         case 14:
            return "On-screen Show (16:9)";
         case 15:
            return "On-screen Show (16:10)";
         case 16:
            return "Widescreen";
      }
   }

   public d1t(com.aspose.slides.internal.c8m.j8 var1, com.aspose.slides.internal.c8m.e9 var2) {
      super(var1, var2);
   }

   public d1t(com.aspose.slides.internal.c8m.j8 var1, com.aspose.slides.internal.c8m.o5 var2) {
      super(var1, var2);
   }
}
