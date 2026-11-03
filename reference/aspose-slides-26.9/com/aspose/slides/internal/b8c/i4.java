package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class i4 implements Cloneable {
   private int n5 = 0;
   private Hashtable l6 = null;
   private String k5;

   public i4() {
   }

   public i4(String var1, String var2) {
      this.k5 = var2;
      var1 = com.aspose.slides.ms.System.d1.l6(var1);
      if ("##any".equals(var1) || var1.length() == 0) {
         this.n5 = 0;
      } else if ("##other".equals(var1)) {
         this.n5 = 1;
      } else {
         this.n5 = 2;
         this.l6 = new Hashtable();
         String[] var3 = com.aspose.slides.ms.System.Xml.f4.c4(var1);

         for (int var4 = 0; var4 < var3.length; var4++) {
            if ("##local".equals(var3[var4])) {
               this.l6.set_Item(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5);
            } else if ("##targetNamespace".equals(var3[var4])) {
               this.l6.set_Item(var2, var2);
            } else {
               com.aspose.slides.ms.System.Xml.f4.z8(var3[var4]);
               this.l6.set_Item(var3[var4], var3[var4]);
            }
         }
      }
   }

   public final i4 n5() {
      i4 var1 = (i4)this.a6();
      if (this.n5 == 2) {
         var1.l6 = (Hashtable)this.l6.deepClone();
      }

      return var1;
   }

   public final int l6() {
      return this.n5;
   }

   public final String k5() {
      return this.k5;
   }

   public final ICollection u3() {
      switch (this.n5) {
         case 0:
         case 1:
         default:
            throw new InvalidOperationException();
         case 2:
            return this.l6.getKeys();
      }
   }

   public boolean n5(String var1) {
      switch (this.n5) {
         case 0:
            return true;
         case 1:
            return !com.aspose.slides.ms.System.d1.a6(var1, this.k5) && var1.length() != 0;
         case 2:
            return this.l6.get_Item(var1) != null;
         default:
            return false;
      }
   }

   public final boolean n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      return this.n5(var1.n5());
   }

   @Override
   public String toString() {
      switch (this.n5) {
         case 0:
            return "##any";
         case 1:
            return "##other";
         case 2:
            com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
            boolean var2 = true;
            IEnumerator var3 = this.l6.getKeys().iterator();

            try {
               while (var3.hasNext()) {
                  String var4 = (String)var3.next();
                  if (var2) {
                     var2 = false;
                  } else {
                     var1.n5(" ");
                  }

                  if (com.aspose.slides.ms.System.d1.a6(var4, this.k5)) {
                     var1.n5("##targetNamespace");
                  } else if (var4.length() == 0) {
                     var1.n5("##local");
                  } else {
                     var1.n5(var4);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  ((IDisposable)var3).dispose();
               }
            }

            return var1.toString();
         default:
            return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public static boolean n5(i4 var0, i4 var1) {
      if (var1.n5 == 0) {
         return true;
      }

      if (var0.n5 == 1 && var1.n5 == 1) {
         return com.aspose.slides.ms.System.d1.a6(var1.k5, var0.k5);
      }

      if (var0.n5 != 2) {
         return false;
      }

      if (var1.n5 == 1) {
         return !var0.l6.contains(var1.k5);
      }

      IEnumerator var2 = var0.l6.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            if (!var1.l6.contains(var3)) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      return true;
   }

   public static i4 n5(i4 var0, i4 var1, boolean var2) {
      i4 var3 = null;
      if (var0.n5 == 0) {
         var3 = new i4();
      } else if (var1.n5 == 0) {
         var3 = new i4();
      } else if (var0.n5 == 2 && var1.n5 == 2) {
         var3 = var0.n5();
         IEnumerator var4 = var1.l6.getKeys().iterator();

         try {
            while (var4.hasNext()) {
               String var5 = (String)var4.next();
               var3.l6.set_Item(var5, var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               ((IDisposable)var4).dispose();
            }
         }
      } else if (var0.n5 == 1 && var1.n5 == 1) {
         if (com.aspose.slides.ms.System.d1.a6(var0.k5, var1.k5)) {
            var3 = var0.n5();
         } else {
            var3 = new i4("##other", com.aspose.slides.ms.System.d1.n5);
         }
      } else if (var0.n5 == 2 && var1.n5 == 1) {
         if (var2) {
            if (var0.l6.contains(var1.k5)) {
               var3 = new i4();
            } else {
               var3 = var1.n5();
            }
         } else if (!com.aspose.slides.ms.System.d1.a6(var1.k5, com.aspose.slides.ms.System.d1.n5)) {
            var3 = var0.n5(var1);
         } else if (var0.l6.contains(com.aspose.slides.ms.System.d1.n5)) {
            var3 = new i4();
         } else {
            var3 = new i4("##other", com.aspose.slides.ms.System.d1.n5);
         }
      } else if (var1.n5 == 2 && var0.n5 == 1) {
         if (var2) {
            if (var1.l6.contains(var1.k5)) {
               var3 = new i4();
            } else {
               var3 = var0.n5();
            }
         } else if (!com.aspose.slides.ms.System.d1.a6(var0.k5, com.aspose.slides.ms.System.d1.n5)) {
            var3 = var1.n5(var0);
         } else if (var1.l6.contains(com.aspose.slides.ms.System.d1.n5)) {
            var3 = new i4();
         } else {
            var3 = new i4("##other", com.aspose.slides.ms.System.d1.n5);
         }
      }

      return var3;
   }

   private i4 n5(i4 var1) {
      i4 var2 = null;
      if (this.l6.contains(var1.k5)) {
         if (this.l6.contains(com.aspose.slides.ms.System.d1.n5)) {
            var2 = new i4();
         } else {
            var2 = new i4("##other", com.aspose.slides.ms.System.d1.n5);
         }
      } else if (this.l6.contains(com.aspose.slides.ms.System.d1.n5)) {
         var2 = null;
      } else {
         var2 = var1.n5();
      }

      return var2;
   }

   public static i4 l6(i4 var0, i4 var1, boolean var2) {
      i4 var3 = null;
      if (var0.n5 == 0) {
         var3 = var1.n5();
      } else if (var1.n5 == 0) {
         var3 = var0.n5();
      } else if (var0.n5 == 2 && var1.n5 == 1) {
         var3 = var0.n5();
         var3.l6(var1.k5);
         if (!var2) {
            var3.l6(com.aspose.slides.ms.System.d1.n5);
         }
      } else if (var0.n5 == 1 && var1.n5 == 2) {
         var3 = var1.n5();
         var3.l6(var0.k5);
         if (!var2) {
            var3.l6(com.aspose.slides.ms.System.d1.n5);
         }
      } else if (var0.n5 == 2 && var1.n5 == 2) {
         i4 var9 = var0.n5();
         var3 = new i4();
         var3.n5 = 2;
         var3.l6 = new Hashtable();
         IEnumerator var4 = var0.l6.getKeys().iterator();

         try {
            while (var4.hasNext()) {
               String var5 = (String)var4.next();
               if (var1.l6.contains(var5)) {
                  var3.l6.addItem(var5, var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               ((IDisposable)var4).dispose();
            }
         }
      } else if (var0.n5 == 1 && var1.n5 == 1) {
         if (com.aspose.slides.ms.System.d1.a6(var0.k5, var1.k5)) {
            return var0.n5();
         }

         if (!var2) {
            if (com.aspose.slides.ms.System.d1.a6(var0.k5, com.aspose.slides.ms.System.d1.n5)) {
               var3 = var1.n5();
            } else if (com.aspose.slides.ms.System.d1.a6(var1.k5, com.aspose.slides.ms.System.d1.n5)) {
               var3 = var0.n5();
            }
         }
      }

      return var3;
   }

   private void l6(String var1) {
      if (this.l6.get_Item(var1) != null) {
         this.l6.removeItem(var1);
      }
   }

   protected Object a6() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
