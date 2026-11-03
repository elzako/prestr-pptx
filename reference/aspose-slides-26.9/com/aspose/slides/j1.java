package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.SortedList;

class j1 {
   private Presentation n5;
   private com.aspose.slides.internal.k0r.e3 l6;
   private final InterruptionToken k5;
   private Dictionary<Integer, e0i> u3 = new Dictionary<>();
   private SortedList<Integer, y8g> a6 = new SortedList<>();
   private SortedList<Integer, y8g> u9 = new SortedList<>();
   private Dictionary<PPImage, y8g> h0 = new Dictionary<>();
   private Dictionary<Byte, g8h> c8 = new Dictionary<>();
   private com.aspose.slides.internal.k0r.j2p t2;

   public j1(com.aspose.slides.internal.k0r.e3 var1, Presentation var2, InterruptionToken var3) {
      this.l6 = var1;
      this.n5 = var2;
      this.k5 = var3;
      this.t2 = new com.aspose.slides.internal.k0r.j2p();
      this.t2.k5((short)255);
   }

   final y8g n5(IPPImage var1) {
      if (var1 == null) {
         return null;
      }

      PPImage var2 = (PPImage)var1;
      return this.h0.containsKey(var2) && this.h0.get_Item(var2).u9() == 1 ? this.h0.get_Item(var2) : new y8g(var2, 1, this);
   }

   final y8g n5(com.aspose.slides.internal.k0r.z5 var1, IPPImage var2) {
      if (var2 != null && var1 != null) {
         PPImage var3 = (PPImage)var2;
         y8g var4;
         if (this.h0.containsKey(var3) && this.h0.get_Item(var3).u9() == 0) {
            var4 = this.h0.get_Item(var3);
         } else {
            var4 = new y8g(var3, 0, this);
         }

         var4.n5(var1);
         return var4;
      } else {
         return null;
      }
   }

   final g8h n5(com.aspose.slides.internal.k0r.z5 var1, byte var2) {
      if (var1 == null) {
         return null;
      }

      g8h var3;
      if (this.c8.containsKey(var2)) {
         var3 = this.c8.get_Item(var2);
      } else {
         var3 = new g8h(var2, this);
      }

      var3.n5(var1);
      return var3;
   }

   final Presentation n5() {
      return this.n5;
   }

   final com.aspose.slides.internal.k0r.e3 l6() {
      return this.l6;
   }

   final com.aspose.slides.internal.k0r.w7 k5() {
      return this.l6.a6();
   }

   public final byte[] u3() {
      return this.l6.n5();
   }

   final byte[] a6() {
      return this.l6.l6();
   }

   final com.aspose.slides.internal.k0r.h8 u9() {
      return this.l6.k5();
   }

   final com.aspose.slides.internal.k0r.t1 h0() {
      return this.k5().h0();
   }

   final Dictionary<Integer, e0i> c8() {
      return this.u3;
   }

   final SortedList<Integer, y8g> t2() {
      return this.a6;
   }

   final SortedList<Integer, y8g> s7() {
      return this.u9;
   }

   final Dictionary<PPImage, y8g> x8() {
      return this.h0;
   }

   final Dictionary<Byte, g8h> n3() {
      return this.c8;
   }

   final com.aspose.slides.internal.k0r.j2p y4() {
      return this.t2;
   }

   final InterruptionToken e2() {
      return this.k5;
   }
}
