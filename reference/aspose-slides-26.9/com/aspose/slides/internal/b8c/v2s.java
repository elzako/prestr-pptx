package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class v2s extends m9 {
   protected v2s(j9e var1) {
      super(var1);
   }

   public static e3m n5(j9e var0) {
      return new v2s(var0);
   }

   @Override
   public String n5(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var3 == n3) {
            return (String)var1;
         } else {
            return var3 == y4 ? ((x6)var1).c8() : (String)this.l6(var1, n3, var2);
         }
      }
   }

   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == n3) {
         return var1;
      } else if (var2 == y4) {
         return new x6(this.n5(), var1);
      } else {
         return var2 == k7 ? new x6(this.n5(), var1) : this.l6(var1, var2, var3);
      }
   }

   @Override
   public Object n5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == n3) {
         return this.n5(var1, var3);
      }

      if (var2 == y4) {
         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      if (var2 == k7) {
         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      return this.l6(var1, var2, var3);
   }
}
