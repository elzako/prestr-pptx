package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XmlSchemaException;

public class k5 {
   private ArrayList n5;
   private String l6;
   private boolean k5;
   private com.aspose.slides.ms.System.Xml.s2 u3;

   public final ArrayList n5() {
      return this.n5;
   }

   public k5(String var1, boolean var2, com.aspose.slides.ms.System.Xml.s2 var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.n5(var1, var2, var3);
   }

   private static boolean k5(com.aspose.slides.internal.v7y.y5 var0) {
      return var0.h0() == 3 && var0.u9() == 1;
   }

   public static boolean n5(com.aspose.slides.internal.v7y.y5 var0) {
      return var0.h0() == 2 && var0.u9() == 2;
   }

   private static boolean u3(com.aspose.slides.internal.v7y.y5 var0) {
      return var0.h0() == 5 && var0.u9() == 9 && var0.c8();
   }

   public static boolean l6(com.aspose.slides.internal.v7y.y5 var0) {
      return var0.h0() == 12 && var0.u9() == 9 && var0.c8();
   }

   public final void n5(String var1, boolean var2, com.aspose.slides.ms.System.Xml.s2 var3) {
      if (var1 != null && var1.length() != 0) {
         String[] var4 = com.aspose.slides.ms.System.d1.n5(var1, '|');
         ArrayList var5 = new ArrayList(var4.length);
         this.n5 = new ArrayList(var4.length);

         try {
            for (int var6 = 0; var6 < var4.length; var6++) {
               com.aspose.slides.internal.v7y.y5 var7 = (com.aspose.slides.internal.v7y.y5)com.aspose.slides.internal.v7y.y8.n5(var4[var6]);
               var5.addItem(var7);
            }
         } catch (RuntimeException var14) {
            throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", var1);
         }

         for (int var17 = 0; var17 < var5.size(); var17++) {
            com.aspose.slides.internal.v7y.y5 var8 = (com.aspose.slides.internal.v7y.y5)var5.get_Item(var17);
            com.aspose.slides.internal.v7y.y5 var15 = var8;
            if (var8 == null) {
               throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", var1);
            }

            com.aspose.slides.internal.v7y.y5 var9 = var15;
            if (n5(var15)) {
               if (!var2) {
                  throw new XmlSchemaException("'{0}' is an invalid XPath for selector. Selector cannot have an XPath selection with an attribute node.", var1);
               }

               this.n5(var15, var3);

               try {
                  var15 = (com.aspose.slides.internal.v7y.y5)var15.k5();
               } catch (RuntimeException var13) {
                  throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", var1);
               }
            }

            while (var15 != null && (k5(var15) || l6(var15))) {
               if (l6(var15) && var8 != var15) {
                  var9.n5(var15.k5());
               } else {
                  var9 = var15;
                  if (k5(var15)) {
                     this.n5(var15, var3);
                  }
               }

               try {
                  var15 = (com.aspose.slides.internal.v7y.y5)var15.k5();
               } catch (RuntimeException var12) {
                  throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", var1);
               }
            }

            var9.n5((com.aspose.slides.internal.v7y.c4)null);
            if (var15 == null) {
               if (l6(var8) && var8.k5() != null) {
                  this.n5.addItem(new t3(w5.l6((com.aspose.slides.internal.v7y.y5)var8.k5()), false));
               } else {
                  this.n5.addItem(new t3(w5.l6(var8), false));
               }
            } else {
               if (!u3(var15)) {
                  throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", var1);
               }

               try {
                  var15 = (com.aspose.slides.internal.v7y.y5)var15.k5();
               } catch (RuntimeException var11) {
                  throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", var1);
               }

               if (var15 == null || !l6(var15) || var15.k5() != null) {
                  throw new XmlSchemaException("'{0}' is an invalid XPath for selector or field.", var1);
               }

               if (l6(var8) && var8.k5() != null) {
                  this.n5.addItem(new t3(w5.l6((com.aspose.slides.internal.v7y.y5)var8.k5()), true));
               } else {
                  this.n5.addItem(new t3(w5.l6(var8), true));
               }
            }
         }
      } else {
         throw new XmlSchemaException("The XPath for selector or field cannot be empty.", com.aspose.slides.ms.System.d1.n5);
      }
   }

   private void n5(com.aspose.slides.internal.v7y.y5 var1, com.aspose.slides.ms.System.Xml.s2 var2) {
      if (var1.u3().length() != 0) {
         var1.n5(var2.n5(var1.u3()));
         if (var1.t2() == null) {
            throw new XmlSchemaException("The prefix '{0}' in XPath cannot be resolved.", var1.u3());
         }
      } else if (var1.a6().length() != 0) {
         var1.n5((String)null);
      } else {
         var1.n5("");
      }
   }
}
