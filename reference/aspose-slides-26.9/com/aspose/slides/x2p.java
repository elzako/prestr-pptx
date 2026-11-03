package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class x2p {
   private final List<h6k> n5 = new List<>();

   public final String n5() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            h6k var3 = (h6k)var2.next();
            var1.n5(var3.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }

   public static x2p n5(IParagraph var0) {
      if (var0 == null) {
         throw new ArgumentNullException("paragraph");
      }

      x2p var1 = new x2p();
      IGenericEnumerator var2 = var0.getPortions().iterator();

      try {
         while (var2.hasNext()) {
            IPortion var3 = (IPortion)var2.next();
            var1.n5(n5(var3));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private void n5(x2p var1) {
      this.n5.addRange(var1.n5);
   }

   private static x2p n5(IPortion var0) {
      x2p var1 = new x2p();

      for (int var2 = 0; var2 < var0.getText().length(); var2++) {
         char var3 = var0.getText().charAt(var2);
         var1.n5(new h6k(var0, var3));
      }

      var1.l6();
      return var1;
   }

   private void l6() {
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            h6k var2 = (h6k)var1.next();
            var2.l6().setText("");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private void n5(h6k var1) {
      this.n5.addItem(var1);
   }

   private void n5(int var1, x2p var2) {
      this.n5.insertRange(var1, var2.n5);
   }

   private void n5(int var1, int var2) {
      this.n5.removeRange(var1, var2);
   }

   private List<Portion> k5() {
      List var1 = new List();

      for (int var2 = 1; var2 < this.n5.size(); var2++) {
         if (this.n5.get_Item(var2 - 1).l6() == this.n5.get_Item(var2).l6()) {
            this.n5.get_Item(var2 - 1).n5(this.n5.get_Item(var2));
            this.n5.removeAt(var2);
            var2--;
         }
      }

      List$Enumerator var7 = this.n5.iterator();

      try {
         while (var7.hasNext()) {
            h6k var3 = (h6k)var7.next();
            var1.addItem(var3.k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return var1;
   }

   public final boolean n5(String var1, String var2, PortionFormat var3) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("String to find can not be null or empty", "find");
      }

      if (var2 == null) {
         throw new ArgumentNullException("replace");
      }

      if (com.aspose.slides.ms.System.d1.a6(var2, var1)) {
         throw new ArgumentException("String to find can not be equal to string to replace");
      }

      int var4 = com.aspose.slides.ms.System.d1.c8(this.n5(), var1);
      if (var4 < 0) {
         return false;
      }

      if (var3 == null) {
         var3 = this.n5(var4);
      }

      Portion var5 = new Portion(var2);
      ((PortionFormat)var5.getPortionFormat()).n5(com.aspose.slides.internal.v6g.k5.n5(var3, PortionFormat.class));
      this.n5(var4, var1.length());
      this.n5(var4, n5(var5));
      return true;
   }

   private PortionFormat n5(int var1) {
      return com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var1).l6().getPortionFormat(), PortionFormat.class);
   }

   public final void l6(IParagraph var1) {
      if (var1 == null) {
         throw new ArgumentNullException("paragraph");
      }

      List$Enumerator var2 = this.k5().iterator();

      try {
         while (var2.hasNext()) {
            Portion var3 = (Portion)var2.next();
            var1.getPortions().add(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
