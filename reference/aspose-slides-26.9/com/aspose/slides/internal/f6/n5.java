package com.aspose.slides.internal.f6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.e1.s7;
import com.aspose.slides.internal.e1.x8;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.n2d.m3;
import com.aspose.slides.internal.z4.c8;
import com.aspose.slides.internal.z4.j5;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.internal.z4.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n5 extends z1 {
   private boolean n5;
   private String k5;
   private final SortedList<String, l6> u3 = new SortedList<>();
   private final SortedList<String, com.aspose.slides.internal.c0.l6> a6 = new m3<>();

   public n5(c8 var1) {
      super(var1);
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      if (this.n5) {
         var1.n5("/SigFlags", 2);
      }

      var1.k5("/Fields", this.n5());
      this.n5(var1, "/DR");
      var1.t2();
      var1.l6();
      IGenericEnumerator var2 = this.u3.getValues().iterator();

      try {
         while (var2.hasNext()) {
            l6 var3 = (l6)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void n5(s3 var1, String var2) {
      if (this.a6.size() != 0) {
         var1.n5(var2);
         var1.c8();
         var1.n5("/Font");
         var1.c8();
         IGenericEnumerator var3 = this.a6.getValues().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.c0.l6 var4 = (com.aspose.slides.internal.c0.l6)var3.next();
               var1.k5(d1.n5("/{0}", new Object[]{var4.x8()}), var4.t2());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         var1.t2();
         var1.t2();
      }
   }

   public final void n5(com.aspose.slides.internal.e1.s3 var1, j5 var2) {
      this.n5(new a6(var2, var1));
   }

   public final void n5(s7 var1, j5 var2) {
      this.n5(new k5(var2, var1));
   }

   public final void n5(x8 var1, j5 var2) {
      this.n5(new u3(var2, var1));
   }

   private void n5(l6 var1) {
      var1.a6().n5(var1);
      if (this.u3.containsKey(var1.k5())) {
         throw new ArgumentException("Names must be unique.");
      }

      this.u3.addItem(var1.k5(), var1);
   }

   private String n5() {
      a5 var1 = new a5();
      var1.n5("[ ");
      IGenericEnumerator var2 = this.u3.getValues().iterator();

      try {
         while (var2.hasNext()) {
            l6 var3 = (l6)var2.next();
            var1.n5(var3.t2());
            var1.n5(" ");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (this.n5) {
         var1.n5(this.k5);
         var1.n5(" ");
      }

      var1.n5(" ]");
      return var1.toString();
   }

   public final com.aspose.slides.internal.c0.l6 n5(com.aspose.slides.internal.p1s.l6 var1) {
      com.aspose.slides.internal.c0.l6 var2 = this.l6.k5().n5(var1, true, this.h0().l6().k7());
      this.a6.set_Item(var2.x8(), var2);
      return var2;
   }
}
