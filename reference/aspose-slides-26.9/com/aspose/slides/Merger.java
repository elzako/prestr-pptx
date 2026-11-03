package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;
import java.io.OutputStream;

public class Merger {
   private Merger() {
   }

   public static void process(String[] inputFileNames, String outputFileName) {
      e7n.n5(outputFileName, "outputFileName");
      n5(inputFileNames, outputFileName, null, null);
   }

   public static void process(String[] inputFileNames, String outputFileName, ISaveOptions options) {
      e7n.n5(outputFileName, "outputFileName");
      n5(inputFileNames, outputFileName, null, options);
   }

   public static void process(String[] inputFileNames, OutputStream outputStream) {
      com.aspose.slides.internal.l6o.l6.n5(new Merger$1(outputStream, inputFileNames));
   }

   static void n5(String[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      e7n.n5(var1, "outputStream");
      n5(var0, com.aspose.slides.ms.System.d1.n5, var1, null);
   }

   public static void process(String[] inputFileNames, OutputStream outputStream, ISaveOptions options) {
      com.aspose.slides.internal.l6o.l6.n5(new Merger$2(outputStream, inputFileNames, options));
   }

   static void n5(String[] var0, com.aspose.slides.internal.z0k.t4 var1, ISaveOptions var2) {
      e7n.n5(var1, "outputStream");
      n5(var0, com.aspose.slides.ms.System.d1.n5, var1, var2);
   }

   private static void n5(String[] var0, String var1, com.aspose.slides.internal.z0k.t4 var2, ISaveOptions var3) {
      e7n.n5(var0, "inputFileNames");
      if (var0.length == 0) {
         throw new ArgumentException("Value cannot be empty.", "inputFileNames");
      }

      try {
         com.aspose.slides.internal.n8e.a5.n5(15, 10, 2);
         int var4 = 0;
         Presentation var5 = new Presentation();

         try {
            ISlideCollection var6 = var5.getSlides();
            var6.removeAt(0);
            com.aspose.slides.internal.o9b.f2 var7 = ((SlideSize)var5.getSlideSize()).n5().a6();

            for (int var8 = 0; var8 < var0.length; var8++) {
               Presentation var9 = new Presentation(var0[var8]);

               try {
                  var9.getMasters().removeUnused(true);
                  var9.getLayoutSlides().removeUnused();
                  if (var8 == 0) {
                     var4 = var9.getSourceFormat();
                     ((SlideSize)var9.getSlideSize()).n5().l6(var7);
                     var5.getSlideSize().setSize(var7.l6(), var7.k5(), 0);
                  } else {
                     if (var4 != var9.getSourceFormat()) {
                        throw new ArgumentException("The paths array must contain files of the same format.", "inputFileNames");
                     }

                     if (com.aspose.slides.internal.o9b.f2.k5(((SlideSize)var9.getSlideSize()).n5(), var7)) {
                        var9.getSlideSize().setSize(var7.l6(), var7.k5(), 0);
                     }
                  }

                  IGenericEnumerator var10 = var9.getSlides().iterator();

                  try {
                     while (var10.hasNext()) {
                        ISlide var11 = (ISlide)var10.next();
                        var6.addClone(var11);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                        var10.dispose();
                     }
                  }
               } finally {
                  if (var9 != null) {
                     var9.dispose();
                  }
               }
            }

            if (!var1.isEmpty()) {
               var5.save(var1, SlideUtil.toSaveFormat(var4), var3);
            } else {
               var5.n5(var2, SlideUtil.toSaveFormat(var4), var3);
            }
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         com.aspose.slides.internal.n8e.a5.l6(15, 10, 2);
      }
   }
}
