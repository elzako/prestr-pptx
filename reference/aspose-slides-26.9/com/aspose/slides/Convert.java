package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Dimension;

public class Convert {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      ".ppt", ".pdf", ".xps", ".pptx", ".ppsx", ".tiff", ".odp", ".pptm", ".potx", ".potm", ".html", ".swf", ".otp", ".pps", ".pot", ".fodp", ".gif"
   );

   public static void autoByExtension(String presPath, String outPath) {
      e7n.n5(presPath, "presPath");
      e7n.n5(outPath, "outPath");
      String var2 = com.aspose.slides.internal.z0k.z1.a6(outPath);
      switch (n5.n5(com.aspose.slides.ms.System.d1.u9(var2))) {
         case 0:
            n5(presPath, outPath);
            break;
         case 1:
            toPdf(presPath, outPath);
            break;
         case 2:
            l6(presPath, outPath);
            break;
         case 3:
            k5(presPath, outPath);
            break;
         case 4:
            u3(presPath, outPath);
            break;
         case 5:
            a6(presPath, outPath);
            break;
         case 6:
            u9(presPath, outPath);
            break;
         case 7:
            h0(presPath, outPath);
            break;
         case 8:
            c8(presPath, outPath);
            break;
         case 9:
            t2(presPath, outPath);
            break;
         case 10:
            s7(presPath, outPath);
            break;
         case 11:
            x8(presPath, outPath);
            break;
         case 12:
            n3(presPath, outPath);
            break;
         case 13:
            y4(presPath, outPath);
            break;
         case 14:
            e2(presPath, outPath);
            break;
         case 15:
            t9(presPath, outPath);
            break;
         case 16:
            z1(presPath, outPath);
            break;
         default:
            throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.d1.n5("Unknown or unsupported format: {0}", new Object[]{var2}));
      }
   }

   private static void n5(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 0);
   }

   private static void l6(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 2);
   }

   private static void k5(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 3);
   }

   private static void u3(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 4);
   }

   private static void a6(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 5);
   }

   private static void u9(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 6);
   }

   private static void h0(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 7);
   }

   private static void c8(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 10);
   }

   private static void t2(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 11);
   }

   private static void s7(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 13);
   }

   private static void x8(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 15);
   }

   private static void n3(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 17);
   }

   private static void y4(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 19);
   }

   private static void e2(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 20);
   }

   private static void t9(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 21);
   }

   private static void z1(String var0, String var1) {
      e7n.n5(var0, "presPath");
      e7n.n5(var1, "outPath");
      n5(var0, var1, 22);
   }

   public static void toPdf(String presPath, String outPath) {
      e7n.n5(presPath, "presPath");
      e7n.n5(outPath, "outPath");
      Presentation var2 = new Presentation(presPath);

      try {
         toPdf(var2, outPath);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static void toPdf(String presPath, String outPath, IPdfOptions options) {
      e7n.n5(presPath, "presPath");
      e7n.n5(outPath, "outPath");
      e7n.n5(options, "options");
      Presentation var3 = new Presentation(presPath);

      try {
         NotesCommentsLayoutingOptions var4 = com.aspose.slides.internal.v6g.k5.n5(options.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
         if (var4 != null) {
            var4.n5(true);
         }

         PdfOptions var5 = com.aspose.slides.internal.v6g.k5.n5(options, PdfOptions.class);
         if (var5 != null) {
            var5.n5(true);
         }

         toPdf(var3, outPath, options);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public static void toPdf(Presentation pres, String outPath) {
      e7n.n5(outPath, "outPath");
      toPdf(pres, outPath, new PdfOptions());
   }

   public static void toPdf(Presentation pres, String outPath, IPdfOptions options) {
      e7n.n5(pres, "pres,");
      e7n.n5(outPath, "outPath");
      PdfOptions var3 = com.aspose.slides.internal.v6g.k5.n5(options, PdfOptions.class);
      if (var3 != null) {
         var3.n5(true);
      }

      pres.save(outPath, 1, options);
   }

   public static void toSvg(String presPath) {
      e7n.n5(presPath, "presPath");
      Presentation var1 = new Presentation(presPath);

      try {
         toSvg(var1, null, null);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static void toSvg(String presPath, Convert$GetOutPathCallback getOutPath) {
      e7n.n5(presPath, "presPath");
      e7n.n5(getOutPath, "getOutPath,");
      Presentation var2 = new Presentation(presPath);

      try {
         toSvg(var2, getOutPath);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static void toSvg(Presentation pres, Convert$GetOutPathCallback getOutPath) {
      e7n.n5(pres, "pres");
      e7n.n5(getOutPath, "getOutPath,");
      toSvg(pres, getOutPath, null);
   }

   public static void toSvg(Presentation pres, ISVGOptions options) {
      e7n.n5(pres, "pres");
      toSvg(pres, null, options);
   }

   public static void toSvg(Presentation pres, Convert$GetOutPathCallback getOutPath, ISVGOptions options) {
      e7n.n5(pres, "pres");
      e7n.n5(getOutPath, "getOutPath,");
      if (getOutPath != null) {
         ForEach.slide(pres, new Convert$1(getOutPath, options));
      } else {
         ForEach.slide(pres, new Convert$2(pres, options));
      }
   }

   public static void toJpeg(Presentation pres, String outputFileName) {
      toJpeg(pres, outputFileName, 1.0F, null);
   }

   public static void toJpeg(Presentation pres, String outputFileName, Dimension imageSize) {
      n5(pres, outputFileName, com.aspose.slides.internal.o9b.p8.n5(imageSize));
   }

   static void n5(Presentation var0, String var1, com.aspose.slides.internal.o9b.p8 var2) {
      n5(var0, var1, 5, var2.u3(), 1.0F, null);
   }

   public static void toJpeg(Presentation pres, String outputFileName, float scale, IRenderingOptions options) {
      n5(pres, outputFileName, 5, com.aspose.slides.internal.o9b.p8.n5.u3(), scale, options);
   }

   public static void toPng(Presentation pres, String outputFileName) {
      toPng(pres, outputFileName, 1.0F, null);
   }

   public static void toPng(Presentation pres, String outputFileName, Dimension imageSize) {
      l6(pres, outputFileName, com.aspose.slides.internal.o9b.p8.n5(imageSize));
   }

   static void l6(Presentation var0, String var1, com.aspose.slides.internal.o9b.p8 var2) {
      n5(var0, var1, 6, var2.u3(), 1.0F, null);
   }

   public static void toPng(Presentation pres, String outputFileName, float scale, IRenderingOptions options) {
      n5(pres, outputFileName, 6, com.aspose.slides.internal.o9b.p8.n5.u3(), scale, options);
   }

   public static void toTiff(Presentation pres, String outputFileName) {
      n5(pres, outputFileName, 7, com.aspose.slides.internal.o9b.p8.n5.u3(), 1.0F, null);
   }

   public static void toTiff(Presentation pres, String outputFileName, ITiffOptions options, boolean multipage) {
      if (multipage) {
         pres.save(outputFileName, 5, options);
      } else {
         n5(pres, outputFileName, 7, com.aspose.slides.internal.o9b.p8.n5.u3(), 1.0F, options);
      }
   }

   private static void n5(Presentation var0, String var1, int var2, com.aspose.slides.internal.o9b.p8 var3, float var4, ISaveOptions var5) {
      e7n.n5(var1, "outputFileName");
      String var6 = com.aspose.slides.internal.z0k.z1.n5(var1, null);
      String var7 = com.aspose.slides.internal.z0k.z1.a6(var1);
      if (com.aspose.slides.ms.System.d1.n5(var7)) {
         switch (var2) {
            case 1:
               var7 = ".bmp";
               break;
            case 2:
            case 3:
            case 6:
            default:
               var7 = ".png";
               break;
            case 4:
               var7 = ".gif";
               break;
            case 5:
               var7 = ".jpeg";
               break;
            case 7:
               var7 = ".tiff";
         }
      }

      TiffOptions var8 = null;
      if (var2 == 7) {
         TiffOptions var9 = com.aspose.slides.internal.v6g.k5.n5(var5, TiffOptions.class);
         if (var9 == null) {
            var9 = new TiffOptions();
         }

         var8 = var9;
      }

      try {
         com.aspose.slides.internal.n8e.a5.n5(var2, 5, 6);
         IGenericEnumerator var20 = var0.getSlides().iterator();

         try {
            while (var20.hasNext()) {
               ISlide var10 = (ISlide)var20.next();
               String var11 = com.aspose.slides.ms.System.d1.n5("{0}_{1}{2}", var6, var10.getSlideNumber(), var7);
               if (var2 == 7) {
                  if (var8.getShowHiddenSlides() || !var10.getHidden()) {
                     var0.save(var11, new int[]{var10.getSlideNumber()}, 5, var8);
                  }
               } else {
                  n5(var10, var5, var4, var3.u3()).save(var11, var2);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }
      } finally {
         com.aspose.slides.internal.n8e.a5.l6(var2, 5, 6);
      }
   }

   private static void n5(String var0, String var1, int var2) {
      Presentation var3 = new Presentation(var0);

      try {
         var3.save(var1, var2);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private static IImage n5(ISlide var0, ISaveOptions var1, float var2, com.aspose.slides.internal.o9b.p8 var3) {
      IRenderingOptions var4 = com.aspose.slides.internal.v6g.k5.n5(var1, IRenderingOptions.class);
      if (var4 != null) {
         return var3.n5() ? var0.getImage(var4, var2, var2) : ((Slide)var0).n5(var4, var3.u3());
      } else {
         return var3.n5() ? var0.getImage(var2, var2) : ((Slide)var0).n5(var3.u3());
      }
   }
}
