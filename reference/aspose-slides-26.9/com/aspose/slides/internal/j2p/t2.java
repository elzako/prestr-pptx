package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.u8;
import com.aspose.slides.ms.System.Xml.w5;

public class t2 extends m8 implements f2 {
   private boolean n5;

   public t2(String var1, String var2, String var3, XmlDocument var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.n5 = var5;
   }

   public final boolean n5() {
      return this.n5;
   }

   @Override
   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(com.aspose.slides.internal.l7h.a5 var1, int var2, n5 var3) {
      Hashtable var4 = new Hashtable();
      SortedList var5 = new SortedList(new f0());
      SortedList var6 = new SortedList(new l6());
      w5 var7 = this.getAttributes();
      if (var7 != null) {
         IEnumerator var8 = var7.iterator();

         try {
            while (var8.hasNext()) {
               u8 var9 = (u8)var8.next();
               if (((a6)var9).n5() || i9.n5((l0)var9) || i9.l6((l0)var9)) {
                  if (i9.n5((l0)var9)) {
                     var3.n5(var9, var5, var4);
                  } else if (i9.l6((l0)var9)) {
                     var3.n5(var9, var5, var6, var4);
                  } else if (this.n5()) {
                     var6.addItem(var9, null);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               ((IDisposable)var8).dispose();
            }
         }
      }

      if (!i9.n5(this, this.getPrefix(), this.getNamespaceURI())) {
         String var34 = this.getPrefix().length() > 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{"xmlns", ":", this.getPrefix()}) : "xmlns";
         u8 var37 = this.getOwnerDocument().createAttribute(var34);
         var37.setValue(this.getNamespaceURI());
         var3.n5(var37, var5, var4);
      }

      if (this.n5()) {
         var3.n5(this, var6, var5, var4);
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"<", this.getName()}));
         IEnumerator var35 = var5.getKeyList().iterator();

         try {
            while (var35.hasNext()) {
               Object var38 = var35.next();
               com.aspose.slides.internal.v6g.k5.n5(var38, a6.class).n5(var1, var2, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var35, IDisposable.class)) {
               ((IDisposable)var35).dispose();
            }
         }

         IEnumerator var39 = var6.getKeyList().iterator();

         try {
            while (var39.hasNext()) {
               Object var10 = var39.next();
               com.aspose.slides.internal.v6g.k5.n5(var10, a6.class).n5(var1, var2, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var39, IDisposable.class)) {
               ((IDisposable)var39).dispose();
            }
         }

         var1.n5(">");
      }

      var3.l6();
      var3.n5(var4);
      var3.n5(var5);
      i0 var36 = this.getChildNodes();
      IEnumerator var40 = var36.iterator();

      try {
         while (var40.hasNext()) {
            l0 var41 = (l0)var40.next();
            z1.n5(var41, var1, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
            ((IDisposable)var40).dispose();
         }
      }

      var3.k5();
      if (this.n5()) {
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"</", this.getName(), ">"}));
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.o8m.f2 var1, int var2, n5 var3) {
      Hashtable var4 = new Hashtable();
      SortedList var5 = new SortedList(new f0());
      SortedList var6 = new SortedList(new l6());
      com.aspose.slides.internal.l7h.u6 var7 = new com.aspose.slides.internal.l7h.u6(false);
      w5 var8 = this.getAttributes();
      if (var8 != null) {
         IEnumerator var9 = var8.iterator();

         try {
            while (var9.hasNext()) {
               u8 var10 = (u8)var9.next();
               if (((a6)var10).n5() || i9.n5((l0)var10) || i9.l6((l0)var10)) {
                  if (i9.n5((l0)var10)) {
                     var3.n5(var10, var5, var4);
                  } else if (i9.l6((l0)var10)) {
                     var3.n5(var10, var5, var6, var4);
                  } else if (this.n5()) {
                     var6.addItem(var10, null);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               ((IDisposable)var9).dispose();
            }
         }
      }

      if (!i9.n5(this, this.getPrefix(), this.getNamespaceURI())) {
         String var36 = this.getPrefix().length() > 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{"xmlns", ":", this.getPrefix()}) : "xmlns";
         u8 var39 = this.getOwnerDocument().createAttribute(var36);
         var39.setValue(this.getNamespaceURI());
         var3.n5(var39, var5, var4);
      }

      if (this.n5()) {
         var3.n5(this, var6, var5, var4);
         byte[] var12 = var7.u3(com.aspose.slides.ms.System.d1.n5(new String[]{"<", this.getName()}));
         var1.n5(var12, 0, var12.length, var12, 0);
         IEnumerator var37 = var5.getKeyList().iterator();

         try {
            while (var37.hasNext()) {
               Object var40 = var37.next();
               com.aspose.slides.internal.v6g.k5.n5(var40, a6.class).n5(var1, var2, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var37, IDisposable.class)) {
               ((IDisposable)var37).dispose();
            }
         }

         IEnumerator var41 = var6.getKeyList().iterator();

         try {
            while (var41.hasNext()) {
               Object var11 = var41.next();
               com.aspose.slides.internal.v6g.k5.n5(var11, a6.class).n5(var1, var2, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
               ((IDisposable)var41).dispose();
            }
         }

         var12 = var7.u3(">");
         var1.n5(var12, 0, var12.length, var12, 0);
      }

      var3.l6();
      var3.n5(var4);
      var3.n5(var5);
      i0 var38 = this.getChildNodes();
      IEnumerator var42 = var38.iterator();

      try {
         while (var42.hasNext()) {
            l0 var43 = (l0)var42.next();
            z1.n5(var43, var1, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
            ((IDisposable)var42).dispose();
         }
      }

      var3.k5();
      if (this.n5()) {
         byte[] var45 = var7.u3(com.aspose.slides.ms.System.d1.n5(new String[]{"</", this.getName(), ">"}));
         var1.n5(var45, 0, var45.length, var45, 0);
      }
   }
}
