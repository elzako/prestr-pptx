package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class e4 extends m9 {
   protected e4(j9e var1) {
      super(var1);
   }

   public static e3m n5(j9e var0) {
      return new e4(var0);
   }

   @Override
   public String n5(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.j8.n5(var1);
      if (var3 == c4) {
         switch (this.l6()) {
            case 26:
               return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.k5(var1, byte[].class));
            case 27:
               return n5(com.aspose.slides.internal.v6g.k5.k5(var1, byte[].class));
         }
      }

      if (var3 == n3) {
         return (String)var1;
      }

      if (n5(var3, y1) && this.l6() == 28) {
         return n5((com.aspose.slides.ms.System.r8)var1);
      }

      if (var3 == a0) {
         switch (this.l6()) {
            case 17:
               return l6(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class).n3());
            case 53:
               return k5(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class).n3());
            case 54:
               return n5(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class).n3());
         }
      }

      if (n5(var3, y2)) {
         switch (this.l6()) {
            case 29:
               return n5((com.aspose.slides.ms.System.Xml.k6)var1, var2);
            case 30:
               return n5((com.aspose.slides.ms.System.Xml.k6)var1, var2);
         }
      }

      return (String)this.k5(var1, n3, var2);
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

      if (var2 == c4) {
         switch (this.l6()) {
            case 26:
               return w1(var1);
            case 27:
               return c8(var1);
         }
      }

      if (var2 == y2) {
         switch (this.l6()) {
            case 29:
               return n5(var1, var3);
            case 30:
               return n5(var1, var3);
         }
      }

      if (var2 == n3) {
         return var1;
      }

      if (var2 == a0) {
         switch (this.l6()) {
            case 17:
               return n3(var1);
            case 53:
               return y2(var1);
            case 54:
               return x8(var1);
         }
      }

      if (var2 == y1 && this.l6() == 28) {
         return com.aspose.slides.ms.System.Xml.f4.z8(var1);
      } else {
         return var2 == y4 ? new x6(this.n5(), var1, var3) : this.u3(var1, var2, var3);
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

      if (var2 == c4) {
         if (var4 == c4) {
            switch (this.l6()) {
               case 26:
                  return com.aspose.slides.internal.v6g.k5.k5(var1, byte[].class);
               case 27:
                  return com.aspose.slides.internal.v6g.k5.k5(var1, byte[].class);
            }
         }

         if (var4 == n3) {
            switch (this.l6()) {
               case 26:
                  return w1((String)var1);
               case 27:
                  return c8((String)var1);
            }
         }
      }

      if (var2 == y2) {
         if (var4 == n3) {
            switch (this.l6()) {
               case 29:
                  return n5((String)var1, var3);
               case 30:
                  return n5((String)var1, var3);
            }
         }

         if (n5(var4, y2)) {
            switch (this.l6()) {
               case 29:
                  return (com.aspose.slides.ms.System.Xml.k6)var1;
               case 30:
                  return (com.aspose.slides.ms.System.Xml.k6)var1;
            }
         }
      }

      if (var2 == n3) {
         return this.n5(var1, var3);
      }

      if (var2 == a0) {
         if (var4 == n3) {
            switch (this.l6()) {
               case 17:
                  return n3((String)var1);
               case 53:
                  return y2((String)var1);
               case 54:
                  return x8((String)var1);
            }
         }

         if (var4 == a0) {
            switch (this.l6()) {
               case 17:
                  return com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class);
               case 53:
                  return com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class);
               case 54:
                  return com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class);
            }
         }
      }

      if (var2 == y1) {
         if (var4 == n3 && this.l6() == 28) {
            return com.aspose.slides.ms.System.Xml.f4.z8((String)var1);
         }

         if (n5(var4, y1) && this.l6() == 28) {
            return (com.aspose.slides.ms.System.r8)var1;
         }
      }

      if (var2 == y4) {
         if (var4 == c4) {
            switch (this.l6()) {
               case 26:
                  return new x6(this.n5(), var1);
               case 27:
                  return new x6(this.n5(), var1);
            }
         }

         if (var4 == n3) {
            return new x6(this.n5(), (String)var1, var3);
         }

         if (var4 == a0) {
            switch (this.l6()) {
               case 17:
                  return new x6(this.n5(), var1);
               case 53:
                  return new x6(this.n5(), var1);
               case 54:
                  return new x6(this.n5(), var1);
            }
         }

         if (n5(var4, y1) && this.l6() == 28) {
            return new x6(this.n5(), var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }

         if (n5(var4, y2)) {
            switch (this.l6()) {
               case 29:
                  return new x6(this.n5(), var1, var3);
               case 30:
                  return new x6(this.n5(), var1, var3);
            }
         }
      }

      if (var2 == k7 && var4 == y4) {
         return (x6)var1;
      } else if (var2 == k7) {
         return (com.aspose.slides.internal.x6s.u3)this.n5(var1, y4, var3);
      } else {
         return var4 == y4 ? ((x6)var1).n5(var2, var3) : this.l6(var1, var2, var3);
      }
   }

   private Object k5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      return var4 == y4 ? ((x6)var1).n5(var2, var3) : this.l6(var1, var2, var3);
   }

   private Object u3(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      return var2 == k7 ? (com.aspose.slides.internal.x6s.u3)this.n5(var1, y4, var3) : this.l6(var1, var2, var3);
   }
}
