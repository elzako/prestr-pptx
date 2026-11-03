package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

public final class w5 extends f8 implements ICollection {
   public w5(l0 var1) {
      super(var1);
   }

   public final u8 n5(int var1) {
      try {
         return (u8)this.l6.n5(var1);
      } catch (ArgumentOutOfRangeException var3) {
         throw new IndexOutOfRangeException(v3.n5("The index being passed in is out of range."));
      }
   }

   public final u8 n5(String var1) {
      int var2 = x7.n5(var1);

      for (int var3 = 0; var3 < this.l6.n5(); var3++) {
         u8 var4 = (u8)this.l6.n5(var3);
         if (var2 == var4.l6() && com.aspose.slides.ms.System.d1.a6(var1, var4.getName())) {
            return var4;
         }
      }

      return null;
   }

   public final u8 n5(String var1, String var2) {
      int var3 = x7.n5(var1);

      for (int var4 = 0; var4 < this.l6.n5(); var4++) {
         u8 var5 = (u8)this.l6.n5(var4);
         if (var3 == var5.l6()
            && com.aspose.slides.ms.System.d1.a6(var1, var5.getLocalName())
            && com.aspose.slides.ms.System.d1.a6(var2, var5.getNamespaceURI())) {
            return var5;
         }
      }

      return null;
   }

   public final int n5(u8 var1) {
      for (int var2 = 0; var2 < this.l6.n5(); var2++) {
         u8 var3 = (u8)this.l6.n5(var2);
         if (var3.l6() == var1.l6()
            && com.aspose.slides.ms.System.d1.a6(var3.getLocalName(), var1.getLocalName())
            && com.aspose.slides.ms.System.d1.a6(var3.getNamespaceURI(), var1.getNamespaceURI())) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public l0 n5(l0 var1) {
      if (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, u8.class)) {
         throw new ArgumentException(v3.n5("An 'Attributes' collection can only contain 'Attribute' objects."));
      }

      int var2 = this.u3(var1.getLocalName(), var1.getNamespaceURI());
      if (var2 == -1) {
         return this.c8((u8)var1);
      }

      l0 var3 = super.k5(var2);
      this.n5(var2, var1);
      return var3;
   }

   public final u8 l6(u8 var1) {
      XmlDocument var2 = var1.getOwnerDocument();
      if (var2 != null && var2.isLoading()) {
         super.n5(var1, var2);
         this.a6(var1);
      } else {
         if (var2 != null && var2 != this.n5.getOwnerDocument()) {
            throw new ArgumentException(v3.n5("The named node is from a different document context."));
         }

         if (var1.u9() != null) {
            this.u3(var1);
         }

         this.l6((l0)var1);
      }

      return var1;
   }

   public final u8 k5(u8 var1) {
      int var2 = this.l6.n5();

      for (int var3 = 0; var3 < var2; var3++) {
         if (this.l6.n5(var3) == var1) {
            this.k5(var3);
            return var1;
         }
      }

      return null;
   }

   public final u8 l6(int var1) {
      return var1 >= 0 && var1 < this.l6() ? (u8)this.k5(var1) : null;
   }

   public final void n5() {
      int var1 = this.l6();

      while (var1 > 0) {
         this.l6(--var1);
      }
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      int var3 = 0;
      int var4 = this.l6();

      while (var3 < var4) {
         array.k5(this.l6.n5(var3), index);
         var3++;
         index++;
      }
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public int size() {
      return super.l6();
   }

   @Override
   public l0 l6(l0 var1) {
      this.h0((u8)var1);
      l0 var2 = super.l6(var1);
      this.a6((u8)var1);
      return var2;
   }

   @Override
   public l0 n5(int var1, l0 var2) {
      l0 var3 = super.n5(var1, var2);
      this.a6((u8)var2);
      return var3;
   }

   @Override
   public l0 k5(int var1) {
      l0 var2 = super.k5(var1);
      this.u9((u8)var2);
      u8 var3 = this.n5.getOwnerDocument().getDefaultAttribute((m8)this.n5, var2.getPrefix(), var2.getLocalName(), var2.getNamespaceURI());
      if (var3 != null) {
         this.n5(var1, var3);
      }

      return var2;
   }

   public final void u3(u8 var1) {
      var1.u9().getAttributes().k5(var1);
   }

   public final void a6(u8 var1) {
      m8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, m8.class);
      if (var2 != null) {
         if (this.n5.getOwnerDocument() == null) {
            return;
         }

         x7 var3 = this.n5.getOwnerDocument().getIDInfoByElement(var2.c8());
         if (var3 != null && com.aspose.slides.ms.System.d1.a6(var3.s7(), var1.k5().s7()) && com.aspose.slides.ms.System.d1.a6(var3.c8(), var1.k5().c8())) {
            this.n5.getOwnerDocument().addElementWithId(var1.getValue(), var2);
         }
      }
   }

   public final void u9(u8 var1) {
      m8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, m8.class);
      if (var2 != null) {
         if (this.n5.getOwnerDocument() == null) {
            return;
         }

         x7 var3 = this.n5.getOwnerDocument().getIDInfoByElement(var2.c8());
         if (var3 != null && com.aspose.slides.ms.System.d1.a6(var3.s7(), var1.k5().s7()) && com.aspose.slides.ms.System.d1.a6(var3.c8(), var1.k5().c8())) {
            this.n5.getOwnerDocument().removeElementWithId(var1.getValue(), var2);
         }
      }
   }

   public final int h0(u8 var1) {
      int var2 = this.u3(var1.getLocalName(), var1.getNamespaceURI());
      if (var2 != -1) {
         u8 var3 = (u8)this.l6.n5(var2);
         super.k5(var2);
         this.u9(var3);
      }

      return var2;
   }

   public final boolean l6(String var1, String var2) {
      m8 var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5, m8.class);
      XmlDocument var4 = this.n5.getOwnerDocument();
      x7 var5 = var4.getIDInfoByElement(var3.c8());
      return var5 != null && com.aspose.slides.ms.System.d1.a6(var5.s7(), var1) && com.aspose.slides.ms.System.d1.a6(var5.c8(), var2);
   }

   public final void k5(String var1, String var2) {
      m8 var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5, m8.class);
      XmlDocument var4 = this.n5.getOwnerDocument();
      var4.removeElementWithId(var1, var3);
      var4.addElementWithId(var2, var3);
   }

   public final u8 c8(u8 var1) {
      l0 var2 = super.l6(var1);
      this.a6(var1);
      return (u8)var2;
   }
}
