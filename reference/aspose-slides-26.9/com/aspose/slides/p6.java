package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.Collections.Generic.SortedDictionary$ValueCollection$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class p6 extends j1w {
   private List<z6n> n5 = null;
   private List<z6n> l6 = null;
   private final List<z6n> k5;
   private long u3 = 23L;

   public p6(Dictionary<Byte, h2d> var1, int var2, h5p var3, q8l var4) {
      super(var1, var2, var3);
      this.k5 = new List<>();
      q8l var5 = this.s7();
      if (var5 != null) {
         this.l6 = var5.l6();
         if (this.l6 != null) {
            List$Enumerator var6 = this.l6.iterator();

            try {
               while (var6.hasNext()) {
                  z6n var7 = (z6n)var6.next();
                  if (!var7.n5()) {
                     this.k5.addItem(var7);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      }

      q8l var16 = this.x8();
      if (var16 != null) {
         this.n5 = var16.l6();
         if (this.n5 != null) {
            List$Enumerator var17 = this.n5.iterator();

            try {
               while (var17.hasNext()) {
                  z6n var8 = (z6n)var17.next();
                  if (!var8.n5()) {
                     this.k5.addItem(var8);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
                  var17.dispose();
               }
            }
         }
      }

      if (var4.l6() != null) {
         this.k5.addRange(var4.l6());
      }
   }

   @Override
   protected String n5() {
      this.y4();
      SortedDictionary var1 = this.n3();
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      var2.n5('_', 80);
      var2.k5();

      for (int var3 = 0; var3 < var1.size(); var3++) {
         SortedDictionary var4 = (SortedDictionary)var1.get_Item((long)var3);
         int var5 = 0;
         SortedDictionary$ValueCollection$Enumerator var6 = var4.getValues().iterator();

         try {
            while (var6.hasNext()) {
               z6n var7 = (z6n)var6.next();
               if ((int)var7.h0() < var5) {
                  var7.a6(var5 + 2L);
               }

               var2.n5(' ', (int)var7.h0() - var5);
               if (var3 < (int)var7.c8()) {
                  var7.u9(var3);
               }

               var2.n5(var7.y4().get_Item(var3 - (int)var7.c8()));
               var5 = (int)(var7.h0() + var7.y4().get_Item(var3 - (int)var7.c8()).length());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         var2.k5();
      }

      var2.k5();
      return var2.toString();
   }

   private SortedDictionary<Long, SortedDictionary<Long, z6n>> n3() {
      SortedDictionary var1 = new SortedDictionary();
      List$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            z6n var3 = (z6n)var2.next();
            if (this.u3 < var3.c8() + var3.y4().size()) {
               this.u3 = var3.c8() + var3.y4().size();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      for (int var21 = 0; var21 <= this.u3; var21++) {
         var1.addItem((long)var21, new SortedDictionary());
         List$Enumerator var4 = this.k5.iterator();

         try {
            while (var4.hasNext()) {
               z6n var5 = (z6n)var4.next();
               if (var21 >= var5.c8() && var21 < var5.c8() + var5.y4().size()) {
                  while (((SortedDictionary)var1.get_Item((long)var21)).containsKey(var5.h0())) {
                     var5.a6(var5.h0() + 1L);
                  }

                  ((SortedDictionary)var1.get_Item((long)var21)).addItem(var5.h0(), var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      for (int var22 = 0; var22 < var1.size(); var22++) {
         SortedDictionary var23 = (SortedDictionary)var1.get_Item((long)var22);
         int var24 = 0;
         SortedDictionary$ValueCollection$Enumerator var6 = var23.getValues().iterator();

         try {
            while (var6.hasNext()) {
               z6n var7 = (z6n)var6.next();
               if ((int)var7.h0() <= var24) {
                  var7.a6(var24 + 2L);
               }

               var24 = (int)(var7.h0() + var7.t2());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      return var1;
   }

   private void y4() {
      for (int var1 = 0; var1 < this.k5.size(); var1++) {
         if (!this.n5(this.k5.get_Item(var1), this.n5) && !this.n5(this.k5.get_Item(var1), this.l6)) {
            this.k5.removeAt(var1--);
         }
      }
   }

   private boolean n5(z6n var1, List<z6n> var2) {
      if (var1.l6()) {
         List$Enumerator var3 = var2.iterator();

         try {
            while (var3.hasNext()) {
               z6n var4 = (z6n)var3.next();
               if (var4.n5()) {
                  if (var1.s7() != null) {
                     if (com.aspose.slides.ms.System.d1.a6(var4.s7(), var1.s7())) {
                        var1.n5(var4);
                        break;
                     }
                  } else if (com.aspose.slides.ms.System.d1.a6(var4.x8(), var1.x8())) {
                     var1.n5(var4);
                     break;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return !var1.l6();
   }
}
