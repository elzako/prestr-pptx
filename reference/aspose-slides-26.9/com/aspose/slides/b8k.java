package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class b8k {
   private int n5 = 0;
   private int l6 = 0;
   private int k5 = 0;
   private int u3 = 0;
   private int a6 = 0;
   private List<String> u9 = new List<>();
   private List<String> h0 = new List<>();

   b8k(IPresentation var1) {
      this.a6 = var1.getSlides().size();
      boolean var2 = var1.getAudios().size() != 0 || var1.getVideos().size() != 0;

      for (int var3 = 0; var3 < this.a6; var3++) {
         ISlide var4 = var1.getSlides().get_Item(var3);
         if (var4.getHidden()) {
            this.n5++;
         }

         if (var4.getNotesSlideManager().getNotesSlide() != null) {
            this.l6++;
         }

         if (var2) {
            this.u3 = this.u3 + this.n5(var4.getShapes());
         }

         String var5 = null;
         String[] var6 = new String[]{var5};
         this.k5 = this.k5 + this.n5(var4.getShapes(), var6);
         var5 = var6[0];
         this.u9
            .addItem(
               com.aspose.slides.ms.System.d1.n5(var5)
                  ? "PowerPoint Presentation"
                  : com.aspose.slides.internal.r7c.c8.n5(var5, "[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F]", "")
            );
      }

      IGenericList var10 = ((Presentation)var1).z1().n5().u3();
      IGenericEnumerator var11 = var10.iterator();

      try {
         while (var11.hasNext()) {
            IFontData var13 = (IFontData)var11.next();
            this.h0.addItem(var13.getFontName());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }
   }

   private int n5(IShapeCollection var1) {
      int var2 = 0;
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, GroupShape.class)) {
               var2 += this.n5(((GroupShape)var4).getShapes());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, AudioFrame.class) || com.aspose.slides.internal.v6g.k5.l6(var4, VideoFrame.class)) {
               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private int n5(IShapeCollection var1, String[] var2) {
      int var3 = 0;
      var2[0] = null;
      IGenericEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            IShape var5 = (IShape)var4.next();
            AutoShape var6 = com.aspose.slides.internal.v6g.k5.n5(var5, AutoShape.class);
            if (var6 != null) {
               if (var6.getTextFrame() != null) {
                  if (var2[0] == null && var6.getPlaceholder() != null && (var6.getPlaceholder().getType() == 0 || var6.getPlaceholder().getType() == 2)) {
                     var2[0] = var6.l6().t2();
                  }

                  var3 += this.n5(var6.getTextFrame());
               }
            } else {
               GroupShape var7 = com.aspose.slides.internal.v6g.k5.n5(var5, GroupShape.class);
               if (var7 != null) {
                  String var21 = null;
                  String[] var25 = new String[]{var21};
                  var3 += this.n5(var7.getShapes(), var25);
                  var21 = var25[0];
                  if (var21 != null) {
                     var2[0] = var21;
                  }
               } else {
                  Chart var8 = com.aspose.slides.internal.v6g.k5.n5(var5, Chart.class);
                  if (var8 != null && var8.getUserShapes() != null) {
                     String var23 = null;
                     String[] var26 = new String[]{var23};
                     var3 += this.n5(var8.getUserShapes().getShapes(), var26);
                     var23 = var26[0];
                  } else {
                     SmartArt var9 = com.aspose.slides.internal.v6g.k5.n5(var5, SmartArt.class);
                     if (var9 != null) {
                        ISmartArtNodeCollection var10 = var9.getAllNodes();
                        IGenericEnumerator var11 = var10.iterator();

                        try {
                           while (var11.hasNext()) {
                              SmartArtNode var12 = (SmartArtNode)var11.next();
                              var3 += this.n5(var12.n5().n5());
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                              var11.dispose();
                           }
                        }
                     }
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }

   private int n5(ITextFrame var1) {
      int var2 = 0;
      IGenericEnumerator var3 = var1.getParagraphs().iterator();

      try {
         while (var3.hasNext()) {
            IParagraph var4 = (IParagraph)var3.next();
            if (var4.getPortions().getCount() == 1) {
               if (((Portion)var4.getPortions().get_Item(0)).h0()) {
                  var2++;
               }
            } else if (var4.getPortions().getCount() != 0) {
               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   final int n5() {
      return this.n5;
   }

   final int l6() {
      return this.a6;
   }

   final int k5() {
      return this.l6;
   }

   final int u3() {
      return this.k5;
   }

   final int a6() {
      return this.u3;
   }

   final List<String> u9() {
      return this.h0;
   }

   final List<String> h0() {
      return this.u9;
   }
}
