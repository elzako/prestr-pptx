package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

public class f8 implements IEnumerable {
   public l0 n5;
   public f8$n5 l6 = new f8$n5();

   public f8(l0 var1) {
      this.n5 = var1;
   }

   public l0 l6(String var1) {
      int var2 = this.k5(var1);
      return var2 >= 0 ? (l0)this.l6.n5(var2) : null;
   }

   public l0 n5(l0 var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = this.u3(var1.getLocalName(), var1.getNamespaceURI());
         if (var2 == -1) {
            this.l6(var1);
            return null;
         } else {
            return this.l6(var2, var1);
         }
      }
   }

   public int l6() {
      return this.l6.n5();
   }

   public l0 u3(int var1) {
      if (var1 >= 0 && var1 < this.l6.n5()) {
         try {
            return (l0)this.l6.n5(var1);
         } catch (ArgumentOutOfRangeException var3) {
            throw new IndexOutOfRangeException(v3.n5("The index being passed in is out of range."));
         }
      } else {
         return null;
      }
   }

   @Override
   public IEnumerator iterator() {
      return this.l6.l6();
   }

   public final int k5(String var1) {
      int var2 = this.l6();

      for (int var3 = 0; var3 < var2; var3++) {
         l0 var4 = (l0)this.l6.n5(var3);
         if (com.aspose.slides.ms.System.d1.a6(var1, var4.getName())) {
            return var3;
         }
      }

      return -1;
   }

   public final int u3(String var1, String var2) {
      int var3 = this.l6();

      for (int var4 = 0; var4 < var3; var4++) {
         l0 var5 = (l0)this.l6.n5(var4);
         if (com.aspose.slides.ms.System.d1.a6(var5.getLocalName(), var1) && com.aspose.slides.ms.System.d1.a6(var5.getNamespaceURI(), var2)) {
            return var4;
         }
      }

      return -1;
   }

   public l0 l6(l0 var1) {
      l0 var2;
      if (var1.getNodeType() == 2) {
         var2 = ((u8)var1).u9();
      } else {
         var2 = var1.getParentNode();
      }

      String var3 = var1.getValue();
      p9 var4 = this.n5.getEventArgs(var1, var2, this.n5, var3, var3, 0);
      if (var4 != null) {
         this.n5.beforeEvent(var4);
      }

      this.l6.n5(var1);
      var1.setParent(this.n5);
      if (var4 != null) {
         this.n5.afterEvent(var4);
      }

      return var1;
   }

   public l0 n5(l0 var1, XmlDocument var2) {
      p9 var3 = var2.getInsertEventArgsForLoad(var1, this.n5);
      if (var3 != null) {
         var2.beforeEvent(var3);
      }

      this.l6.n5(var1);
      var1.setParent(this.n5);
      if (var3 != null) {
         var2.afterEvent(var3);
      }

      return var1;
   }

   public l0 k5(int var1) {
      l0 var2 = (l0)this.l6.n5(var1);
      String var3 = var2.getValue();
      p9 var4 = this.n5.getEventArgs(var2, this.n5, null, var3, var3, 1);
      if (var4 != null) {
         this.n5.beforeEvent(var4);
      }

      this.l6.l6(var1);
      var2.setParent(null);
      if (var4 != null) {
         this.n5.afterEvent(var4);
      }

      return var2;
   }

   public final l0 l6(int var1, l0 var2) {
      l0 var3 = this.k5(var1);
      this.n5(var1, var2);
      return var3;
   }

   public l0 n5(int var1, l0 var2) {
      l0 var3;
      if (var2.getNodeType() == 2) {
         var3 = ((u8)var2).u9();
      } else {
         var3 = var2.getParentNode();
      }

      String var4 = var2.getValue();
      p9 var5 = this.n5.getEventArgs(var2, var3, this.n5, var4, var4, 0);
      if (var5 != null) {
         this.n5.beforeEvent(var5);
      }

      this.l6.n5(var1, var2);
      var2.setParent(this.n5);
      if (var5 != null) {
         this.n5.afterEvent(var5);
      }

      return var2;
   }
}
