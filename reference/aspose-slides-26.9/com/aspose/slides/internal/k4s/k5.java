package com.aspose.slides.internal.k4s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.v9e.j3;
import com.aspose.slides.internal.v9e.j8;
import com.aspose.slides.internal.v9e.j9;
import com.aspose.slides.internal.v9e.p3;
import com.aspose.slides.internal.v9e.z1;
import com.aspose.slides.internal.v9e.z7;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.l1;
import com.aspose.slides.ms.System.Xml.m4;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.v3;

public final class k5 {
   private o8 n5 = null;
   private boolean l6 = false;
   private j8 k5;
   private List<j3> u3;
   private j9 a6;

   private o8 n5() {
      return this.l6 ? this.n5 : com.aspose.slides.internal.s5g.l6.n5();
   }

   public final void n5(c7 var1, o8 var2) {
      this.n5(new com.aspose.slides.internal.x6s.l6(var1, 2), var2);
   }

   public final void n5(com.aspose.slides.internal.x6s.n5 var1, o8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stylesheet");
      }

      this.n5(var1.createNavigator(), var2);
   }

   public final void n5(com.aspose.slides.internal.x6s.a6 var1, o8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stylesheet");
      }

      this.n5(var1, var2, null);
   }

   private void l6() {
      if (this.k5 == null) {
         throw new InvalidOperationException(v3.n5("No stylesheet was loaded."));
      }
   }

   public final void n5(com.aspose.slides.internal.x6s.a6 var1, u3 var2, l1 var3, o8 var4) {
      this.l6();
      p3 var5 = new p3(var1, var2, var4, this.k5, this.u3, this.a6);
      var5.n5(var3);
   }

   public final void n5(com.aspose.slides.internal.x6s.n5 var1, u3 var2, l1 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("input");
      }

      this.n5(var1.createNavigator(), var2, var3, this.n5());
   }

   private void n5(com.aspose.slides.internal.x6s.a6 var1, o8 var2, com.aspose.slides.internal.w1n.n5 var3) {
      z1 var4 = new z1();
      z7 var5 = new z7(var1);
      o8 var6 = var2;
      if (var6 == null) {
         var6 = m4.n5;
      }

      var4.n5(var5, var6, var3);
      this.k5 = var4.c8();
      this.u3 = var4.s7();
      this.a6 = var4.t2();
   }
}
