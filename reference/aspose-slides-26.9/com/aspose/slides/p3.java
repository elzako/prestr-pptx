package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class p3 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("seq");

   public static void n5(IAnimationTimeLine var0, com.aspose.slides.internal.k4y.g4z var1, l4h var2) {
      if (var0 == null) {
         throw new ArgumentNullException("animationTimeLine");
      }

      if (var1 == null) {
         throw new ArgumentNullException("parElement");
      }

      if (var1.n5() != 5) {
         throw new InvalidOperationException();
      }

      List$Enumerator var3 = var1.n3().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            switch (n5.n5(var4.n5())) {
               case 0:
                  n5(var0, (com.aspose.slides.internal.k4y.n8k)var4.l6(), var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(IAnimationTimeLine var0, com.aspose.slides.internal.k4y.n8k var1, l4h var2) {
      switch (var1.n5()) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         default:
            throw new ArgumentOutOfRangeException("seqElement", "Only root sequence types allowed");
         case 6:
            f0.n5((Sequence)var0.getMainSequence(), var1, var2);
            break;
         case 7:
            v0.n5((SequenceCollection)var0.getInteractiveSequences(), var1, var2);
      }
   }
}
