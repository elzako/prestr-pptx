package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.v7y.r8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.k6;

public class j9 extends s0 {
   private Hashtable u3 = new Hashtable();
   private Hashtable a6 = new Hashtable();
   private List<f2> u9;
   private c3 h0;

   public final c3 n5() {
      if (this.h0 == null) {
         this.h0 = new c3();
      }

      return this.h0;
   }

   @Override
   public void l6(z1 var1) {
      this.n5(var1, false);
   }

   public final void n5(k6 var1, int var2, int var3) {
      if (this.u9 == null) {
         this.u9 = new List<>();
      }

      this.u9.addItem(new f2(var1, var2, var3));
   }

   public final u9 n5(k6 var1) {
      u9 var2 = (u9)this.u3.get_Item(var1);
      if (var2 == null) {
         throw XsltException.create(
            "A reference to attribute set '{0}' cannot be resolved. An 'Xsl:attribute-set' of this name must be declared at the top level of the stylesheet.",
            var1.toString()
         );
      } else {
         return var2;
      }
   }

   public final void n5(j8 var1) {
      this.l6(var1);
      IEnumerator var2 = this.u3.getValues().iterator();

      try {
         while (var2.hasNext()) {
            u9 var3 = (u9)var2.next();
            if (var3.l6 != null) {
               var3.l6.reverse();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      this.n5(new Hashtable(), this.u3.getKeys());
   }

   private void l6(j8 var1) {
      if (var1.k5() != null) {
         IEnumerator var2 = var1.k5().getValues().iterator();

         try {
            while (var2.hasNext()) {
               u9 var3 = (u9)var2.next();
               ArrayList var4 = var3.l6;
               u9 var5 = (u9)this.u3.get_Item(var3.n5());
               if (var5 == null) {
                  var5 = new u9();
                  var5.n5 = var3.n5();
                  var5.l6 = new ArrayList();
                  this.u3.set_Item(var3.n5(), var5);
               }

               ArrayList var6 = var5.l6;
               if (var4 != null) {
                  for (int var7 = var4.size() - 1; 0 <= var7; var7--) {
                     var6.addItem(var4.get_Item(var7));
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               ((IDisposable)var2).dispose();
            }
         }
      }

      IEnumerator var16 = var1.l6().iterator();

      try {
         while (var16.hasNext()) {
            j8 var17 = (j8)var16.next();
            this.l6(var17);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            ((IDisposable)var16).dispose();
         }
      }
   }

   private void n5(Hashtable var1, ICollection var2) {
      String var3 = "P";
      String var4 = "D";
      IEnumerator var5 = var2.iterator();

      try {
         while (var5.hasNext()) {
            k6 var6 = (k6)var5.next();
            Object var7 = var1.get_Item(var6);
            if (var7 == "P") {
               throw XsltException.create("Circular reference in the definition of attribute set '{0}'.", var6.toString());
            }

            if (var7 != "D") {
               var1.set_Item(var6, "P");
               this.n5(var1, this.n5(var6));
               var1.set_Item(var6, "D");
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }
   }

   private void n5(Hashtable var1, t4 var2) {
      if (var2.l6 != null) {
         IEnumerator var3 = var2.l6.iterator();

         try {
            while (var3.hasNext()) {
               n5 var4 = (n5)var3.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var4, n1.class)) {
                  this.n5(var1, com.aspose.slides.ms.System.u3.n5((Object)(((n1)var4).n5())));
               } else if (com.aspose.slides.internal.v6g.k5.l6(var4, t4.class)) {
                  this.n5(var1, (t4)var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }
   }

   public final void n5(k6 var1, com.aspose.slides.internal.x7i.l6 var2) {
      com.aspose.slides.internal.x7i.l6 var3 = (com.aspose.slides.internal.x7i.l6)this.a6.get_Item(var1);
      if (var3 != null) {
         com.aspose.slides.internal.x7n.s7 var4 = var3.n5;
         com.aspose.slides.internal.x7n.s7 var5 = var2.n5;
         if (!com.aspose.slides.ms.System.d1.a6(var4.q0(), var5.q0())
            || !com.aspose.slides.ms.System.d1.a6(var4.z3(), var5.z3())
            || !com.aspose.slides.ms.System.d1.a6(var4.d5(), var5.d5())
            || !com.aspose.slides.ms.System.d1.a6(var4.z1(), var5.z1())
            || !com.aspose.slides.ms.System.d1.a6(var4.n3(), var5.n3())
            || !com.aspose.slides.ms.System.d1.a6(var4.a0(), var5.a0())
            || !com.aspose.slides.ms.System.d1.a6(var4.d2(), var5.d2())
            || var3.k5 != var2.k5
            || var3.l6 != var2.l6
            || var3.u3 != var2.u3) {
            throw XsltException.create("Decimal format '{0}' has a duplicate declaration.", var1.toString());
         }
      }

      this.a6.set_Item(var1, var2);
   }

   public final com.aspose.slides.internal.x7i.l6 k5(k6 var1) {
      return com.aspose.slides.internal.v6g.k5.n5(this.a6.get_Item(var1), com.aspose.slides.internal.x7i.l6.class);
   }

   public final List<f2> l6() {
      return this.u9;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            var2.k5(this.n5);
            com.aspose.slides.internal.x6s.a6 var3 = var1.c8().n5();
            var3.z3();
            var2.n5(new r8(var3));
            if (this.l6 != null && this.l6.size() > 0) {
               var1.n5(var2);
            }

            var2.n5(2);
            break;
         case 1:
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid RootAction execution state");
            break;
         case 2:
            var2.l6(var1);
            var1.n5(var2.u9(), null, null);
            var2.n5(3);
            break;
         case 3:
            var2.s7();
      }
   }
}
