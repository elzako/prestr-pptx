package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class c3 {
   private y8 n5;
   private x8 l6;
   private Dictionary<String, w1> k5 = new Dictionary<>();

   c3(int var1, String var2) {
      this.n5 = new y8();
      this.l6 = new x8(var1, var2);
   }

   c3(com.aspose.slides.internal.x1.t2 var1) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (!"VBA".equals(var1.x8())) {
         throw new InvalidOperationException();
      }

      this.l6(var1);
      this.u3(var1);
      this.u9(var1);
   }

   final void n5(com.aspose.slides.internal.x1.t2 var1) {
      this.k5(var1);
      this.a6(var1);
      this.h0(var1);
   }

   final w1 n5(String var1) {
      if (this.k5.containsKey(var1)) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Module with name {0} already exists", new Object[]{var1}));
      }

      e2 var2 = this.l6.n5(var1);
      return this.n5(var2);
   }

   final void l6(String var1) {
      if (!this.k5.containsKey(var1)) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Module with name {0} is not exists", new Object[]{var1}));
      }

      this.l6.l6(var1);
      this.k5.removeItemByKey(var1);
   }

   final void n5(String var1, String var2) {
      int var3 = this.l6.n5().n5().l6() & 65535;
      o5 var4 = new o5(var3);
      var4.n5(new w2(var3, var1));
      var4.n5(new v3(var3, var2));
      this.l6.n5(var4);
   }

   private w1 n5(e2 var1) {
      w1 var2 = new w1(var1, this.l6);
      this.k5.addItem(var1.n5().l6(), var2);
      return var2;
   }

   private void l6(com.aspose.slides.internal.x1.t2 var1) {
      com.aspose.slides.internal.x1.u9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.u3("_VBA_PROJECT"), com.aspose.slides.internal.x1.u9.class);
      if (var2 == null) {
         throw new d1("Can't read VBA project");
      }

      if (var2.n3() > 0) {
         this.n5 = new y8(var2);
      }
   }

   private void k5(com.aspose.slides.internal.x1.t2 var1) {
      com.aspose.slides.internal.x1.u9 var2 = new com.aspose.slides.internal.x1.u9("_VBA_PROJECT");
      this.n5.n5(var2);
      if (!var1.a6(var2)) {
      }
   }

   private void u3(com.aspose.slides.internal.x1.t2 var1) {
      com.aspose.slides.internal.x1.u9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.u3("dir"), com.aspose.slides.internal.x1.u9.class);
      if (var2 == null) {
         throw new d1("Can't read VBA project");
      }

      if (var2.n3() > 0) {
         this.l6 = new x8(var2);
      }
   }

   private void a6(com.aspose.slides.internal.x1.t2 var1) {
      com.aspose.slides.internal.x1.u9 var2 = new com.aspose.slides.internal.x1.u9("dir");
      this.l6.n5(var2);
      if (!var1.a6(var2)) {
      }
   }

   private void u9(com.aspose.slides.internal.x1.t2 var1) {
      List$Enumerator var2 = this.l6.k5().l6().iterator();

      try {
         while (var2.hasNext()) {
            e2 var3 = (e2)var2.next();
            com.aspose.slides.internal.x1.u9 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.u3(var3.n5().l6()), com.aspose.slides.internal.x1.u9.class);
            if (var4 == null) {
               throw new InvalidOperationException();
            }

            if (var4.n3() > 0) {
               w1 var5 = new w1(var4, var3, this.l6);
               this.k5.addItem(var3.n5().l6(), var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void h0(com.aspose.slides.internal.x1.t2 var1) {
      Dictionary$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            com.aspose.slides.internal.x1.u9 var4 = new com.aspose.slides.internal.x1.u9((String)var3.getKey());
            ((w1)var3.getValue()).n5(var4);
            var1.a6(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final x8 n5() {
      return this.l6;
   }

   public final Dictionary<String, w1> l6() {
      return this.k5;
   }
}
