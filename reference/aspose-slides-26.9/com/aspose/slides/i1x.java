package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class i1x {
   private t5w n5;
   private com.aspose.slides.internal.c8m.j8 l6;
   private final SortedList<String, ISlideComponent> k5;
   private final SortedList<String, IControl> u3;
   private final List<ISlideComponent> a6;
   private final Dictionary<IConnector, com.aspose.slides.internal.k4y.g1p> u9;
   private final SortedList<Long, IPlaceholder> h0;
   private final List<IPlaceholder> c8;

   public i1x(t5w var1, com.aspose.slides.internal.c8m.j8 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
      this.u3 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
      this.a6 = new List<>();
      this.u9 = new Dictionary<>();
      this.h0 = new SortedList<>();
      this.c8 = new List<>();
   }

   public final t5w n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.c8m.j8 l6() {
      return this.l6;
   }

   public final com.aspose.slides.internal.c8m.a2 k5() {
      switch (this.n5.u9()) {
         case 0:
         case 1:
         case 2:
            return this.l6.e2();
         case 3:
            return this.l6 == null ? null : this.l6.e2();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   public final SortedList<String, ISlideComponent> u3() {
      return this.k5;
   }

   public final List<ISlideComponent> a6() {
      return this.a6;
   }

   public final boolean n5(String var1, ISlideComponent var2) {
      if (!this.n5.q0()) {
         if (this.u3().containsKey(var1) || "0".equals(var1)) {
            this.a6().addItem(var2);
            return false;
         }

         this.u3().addItem(var1, var2);
      }

      return true;
   }

   public final void n5(IShape var1) {
      String var2 = com.aspose.slides.ms.System.l4.l6(((Shape)var1).v4());
      if (this.u3().containsKey(var2)) {
         this.u3().set_Item(var2, var1);
      } else {
         this.u3().addItem(var2, var1);
      }
   }

   public final SortedList<Long, IPlaceholder> u9() {
      return this.h0;
   }

   public final List<IPlaceholder> h0() {
      return this.c8;
   }

   public final boolean n5(long var1, IPlaceholder var3, boolean var4) {
      if (!this.n5.q0()) {
         if (this.u9().containsKey(var1)) {
            if (var4) {
               this.h0().addItem(var3);
               return false;
            }

            return false;
         }

         this.u9().addItem(var1, var3);
      }

      return true;
   }

   public final boolean n5(long var1, IPlaceholder var3) {
      return this.n5(var1, var3, true);
   }

   public final Dictionary<IConnector, com.aspose.slides.internal.k4y.g1p> c8() {
      return this.u9;
   }

   final void n5(com.aspose.slides.internal.c8m.j8 var1) {
      if (var1 != null) {
         this.l6 = var1;
      }
   }

   final SortedList<String, IControl> t2() {
      return this.u3;
   }

   final void n5(String var1, IControl var2) {
      try {
         if (com.aspose.slides.ms.System.d1.n5(var1)) {
            throw new ArgumentException("spid cannot be null or empty", "spid");
         }

         if ("0".equals(var1)) {
            throw new ArgumentException("spid cannot be '0' for a valid ActiveX control", "spid");
         }

         if (var2 == null) {
            throw new ArgumentNullException("control");
         }

         if (this.u3.containsKey(var1)) {
            throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Duplicate ActiveX control spid: {0}", new Object[]{var1}));
         }

         this.u3.addItem(var1, var2);
      } catch (RuntimeException var4) {
         com.aspose.slides.ms.System.t4.l6("" + var4);
      }
   }
}
