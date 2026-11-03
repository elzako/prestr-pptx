package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class f1t {
   public static void n5(ParagraphFormat var0, com.aspose.slides.internal.k4y.v5n var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("paragraphFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("paragraphProperties");
      }

      switch (var1.z3()) {
         case 2:
            var0.setAlignment(1);
         default:
            switch (var1.q0()) {
               case 2:
                  var0.setHangingPunctuation((byte)1);
               default:
                  n5(var0, var1);
                  double var3 = t2f.u9(var1.u3());
                  if (!com.aspose.slides.ms.System.d2.k5(var3)) {
                     var0.setMarginLeft((float)var3);
                  }

                  double var5 = t2f.u9(var1.a6());
                  if (!com.aspose.slides.ms.System.d2.k5(var5)) {
                     var0.setMarginRight((float)var5);
                  }

                  double var7 = t2f.h0(var1.h0());
                  if (!com.aspose.slides.ms.System.d2.k5(var7)) {
                     var0.setSpaceBefore((float)var7);
                  }

                  double var9 = t2f.h0(var1.c8());
                  if (!com.aspose.slides.ms.System.d2.k5(var9)) {
                     var0.setSpaceAfter((float)var9);
                  }

                  double var11 = t2f.u9(var1.u9());
                  if (!com.aspose.slides.ms.System.d2.k5(var11)) {
                     var0.setIndent((float)var11);
                  }

                  double var13 = t2f.h0(var1.n5());
                  if (!com.aspose.slides.ms.System.d2.k5(var13)) {
                     var0.setSpaceWithin((float)var13);
                  }
            }
      }
   }

   public static void n5(ITextFrameFormat var0, com.aspose.slides.internal.k4y.v5n var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrameFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("paragraphProperties");
      }

      double var3 = t2f.u9(var1.t9());
      if (!com.aspose.slides.ms.System.d2.k5(var3)) {
         var0.setMarginBottom((float)var3);
      }

      double var5 = t2f.u9(var1.e2());
      if (!com.aspose.slides.ms.System.d2.k5(var5)) {
         var0.setMarginTop((float)var5);
      }

      double var7 = t2f.u9(var1.z1());
      if (!com.aspose.slides.ms.System.d2.k5(var7)) {
         var0.setMarginLeft((float)var7);
      }

      double var9 = t2f.u9(var1.t4());
      if (!com.aspose.slides.ms.System.d2.k5(var9)) {
         var0.setMarginRight((float)var9);
      }

      switch (var1.z3()) {
         case 0:
            if (var0.getAnchoringType() == -1) {
               var0.setAnchoringType((byte)0);
            }
            break;
         case 1:
            var0.setAnchoringType((byte)0);
            break;
         case 2:
            var0.setAnchoringType((byte)1);
            break;
         case 3:
            var0.setAnchoringType((byte)2);
            break;
         case 4:
            var0.setAnchoringType((byte)-1);
            break;
         case 5:
            var0.setAnchoringType((byte)-1);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }

      if (var1.m1() == 3) {
         var0.setTextVerticalType((byte)1);
      }
   }

   public static void n5(ITextFrameFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrameFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      var0.setCenterText((byte)0);
      switch (var1.n3()) {
         case 0:
            break;
         case 1:
            var0.setAnchoringType((byte)0);
            break;
         case 2:
            var0.setAnchoringType((byte)1);
            break;
         case 3:
            var0.setAnchoringType((byte)2);
            break;
         case 4:
            var0.setAnchoringType((byte)3);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }

      if (t2f.k5(var1.r4())) {
         var0.setMarginLeft(t2f.u9(var1.r4()));
      }

      if (t2f.k5(var1.c4())) {
         var0.setMarginRight(t2f.u9(var1.c4()));
      }

      if (t2f.k5(var1.j5())) {
         var0.setMarginTop(t2f.u9(var1.j5()));
      }

      if (t2f.k5(var1.w1())) {
         var0.setMarginBottom(t2f.u9(var1.w1()));
      }
   }

   private static void n5(ParagraphFormat var0, com.aspose.slides.internal.k4y.v5n var1) {
      switch (var1.k5()) {
         case 0:
            break;
         case 1:
            var0.setAlignment(0);
            break;
         case 2:
            var0.setAlignment(2);
            break;
         case 3:
            var0.setAlignment(0);
            break;
         case 4:
            var0.setAlignment(2);
            break;
         case 5:
            var0.setAlignment(1);
            break;
         case 6:
            var0.setAlignment(3);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }
}
