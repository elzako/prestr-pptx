package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;

public abstract class g7 {
   private String l6;
   private String k5 = null;
   public o8 n5 = null;
   private boolean u3 = false;
   private s0 a6 = null;
   private e9 u9 = null;
   private Hashtable h0 = null;
   private m8 c8 = null;

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final s0 l6() {
      return this.a6;
   }

   public final void n5(s0 var1) {
      this.a6 = var1;
   }

   public final e9 k5() {
      return this.u9;
   }

   public final void n5(e9 var1) {
      this.u9 = var1;
   }

   protected g7() {
   }

   public final String u3() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final o8 a6() {
      return this.n5;
   }

   public final void n5(o8 var1) {
      this.n5 = var1;
      this.u3 = true;
   }

   public final boolean u9() {
      return this.u3;
   }

   public abstract com.aspose.slides.ms.System.y8[] h0();

   public final boolean n5(com.aspose.slides.ms.System.y8 var1) {
      if (this.h0() != null) {
         for (int var2 = 0; var2 < this.h0().length; var2++) {
            if (var1 == this.h0()[var2] || var1.n5(this.h0()[var2])) {
               return true;
            }
         }
      }

      return false;
   }

   public final m8 n5(XmlDocument var1) {
      return this.n5(var1, "Transform");
   }

   public final m8 n5(XmlDocument var1, String var2) {
      m8 var3 = var1.createElement(var2, "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.u3())) {
         var3.k5("Algorithm", this.u3());
      }

      i0 var4 = this.c8();
      if (var4 != null) {
         IEnumerator var5 = var4.iterator();

         try {
            while (var5.hasNext()) {
               l0 var6 = (l0)var5.next();
               var3.appendChild(var1.importNode(var6, true));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               ((IDisposable)var5).dispose();
            }
         }
      }

      return var3;
   }

   public abstract void n5(i0 var1);

   protected abstract i0 c8();

   public abstract void n5(Object var1);

   public abstract Object t2();

   public abstract Object l6(com.aspose.slides.ms.System.y8 var1);

   public byte[] n5(com.aspose.slides.internal.o8m.f2 var1) {
      return var1.n5((com.aspose.slides.internal.z0k.t4)this.l6(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)));
   }

   public final m8 s7() {
      if (this.c8 != null) {
         return this.c8;
      }

      e9 var1 = this.k5();
      s0 var2 = var1 == null ? this.l6() : var1.h0();
      return var2 == null ? null : var2.k5;
   }

   public final Hashtable x8() {
      if (this.h0 != null) {
         return this.h0;
      }

      e9 var1 = this.k5();
      s0 var2 = var1 == null ? this.l6() : var1.h0();
      if (var1 == null || var1.c8() == 2 && !com.aspose.slides.ms.System.d1.n5(var1.l6()) && var1.l6().charAt(0) == '#') {
         x8 var3 = null;
         if (var1 != null) {
            var3 = var1.n5;
         } else if (var2 != null && var2.k5 != null) {
            var3 = i9.n5(var2.k5);
         }

         if (var3 == null) {
            this.h0 = new Hashtable(0);
            return this.h0;
         }

         this.h0 = new Hashtable(var3.n5());
         IEnumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               l0 var5 = (l0)var4.next();
               String var6 = var5.getPrefix().length() > 0
                  ? com.aspose.slides.ms.System.d1.n5(new String[]{var5.getPrefix(), ":", var5.getLocalName()})
                  : var5.getLocalName();
               if (!this.h0.contains(var6)) {
                  this.h0.addItem(var6, var5.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               ((IDisposable)var4).dispose();
            }
         }

         return this.h0;
      } else {
         this.h0 = new Hashtable(0);
         return this.h0;
      }
   }

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.j8.n5(this).s7().substring(com.aspose.slides.ms.System.j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography.Xml." + var1;
   }
}
