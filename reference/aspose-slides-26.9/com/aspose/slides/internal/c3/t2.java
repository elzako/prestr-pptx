package com.aspose.slides.internal.c3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;

public class t2 {
   private j3 n5;
   private com.aspose.slides.internal.f5.k5 l6;

   public t2(j3 var1, com.aspose.slides.internal.f5.k5 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final com.aspose.slides.internal.l7h.j5 n5() {
      if (this.n5.u3() == 0) {
         return null;
      }

      Object var1 = null;
      this.n5.s7();

      while (!this.n5.k5()) {
         switch (this.n5.h0()) {
            case '<':
               if (this.n5.k5()) {
                  return null;
               }

               switch (this.n5.h0()) {
                  case '!':
                     if (this.n5.k5()) {
                        return null;
                     }

                     switch (this.n5.h0()) {
                        case '-':
                           if (this.n5.k5()) {
                              return null;
                           }

                           switch (this.n5.h0()) {
                              case '-':
                                 this.n5.l6("-->");
                           }
                        default:
                           continue;
                     }
                  case 'M':
                  case 'm':
                     if (this.n5.k5()) {
                        return null;
                     }

                     switch (this.n5.h0()) {
                        case 'E':
                        case 'e':
                           if (this.n5.k5()) {
                              return null;
                           }

                           switch (this.n5.h0()) {
                              case 'T':
                              case 't':
                                 if (this.n5.k5()) {
                                    return null;
                                 }

                                 switch (this.n5.h0()) {
                                    case 'A':
                                    case 'a':
                                       if (this.n5.k5()) {
                                          return null;
                                       }

                                       switch (this.n5.h0()) {
                                          case '\t':
                                          case '\n':
                                          case '\f':
                                          case '\r':
                                          case ' ':
                                          case '/':
                                             Dictionary var2 = new Dictionary();
                                             boolean var3 = false;
                                             com.aspose.slides.ms.System.o5 var4 = new com.aspose.slides.ms.System.o5();
                                             String var5 = null;

                                             t2$n5 var6;
                                             while ((var6 = this.l6()) != null) {
                                                if (!var2.containsKey(var6.n5)) {
                                                   var2.addItem(var6.n5, var6.l6);
                                                   if (com.aspose.slides.ms.System.d1.a6("http-equiv", var6.n5)) {
                                                      var3 = true;
                                                   }

                                                   if (com.aspose.slides.ms.System.d1.a6("content", var6.n5)) {
                                                      var5 = this.n5(var6.l6);
                                                      var4 = new com.aspose.slides.ms.System.o5<>(true);
                                                   }

                                                   if (com.aspose.slides.ms.System.d1.a6("charset", var6.n5)) {
                                                      var4 = new com.aspose.slides.ms.System.o5<>(false);
                                                      var5 = var6.l6;
                                                   }
                                                }
                                             }

                                             if (!com.aspose.slides.ms.System.o5.n5(var4, null)
                                                && (!com.aspose.slides.ms.System.o5.n5(new com.aspose.slides.ms.System.o5<>(true), var4) || var3)) {
                                                if (com.aspose.slides.ms.System.d1.u3("UTF-16", var5, (short)5)) {
                                                   var5 = "UTF-8";
                                                }

                                                try {
                                                   if (!com.aspose.slides.ms.System.d1.n5(var5)) {
                                                      return com.aspose.slides.internal.n2d.x8.n5(var5);
                                                   }
                                                } catch (ArgumentException var8) {
                                                }
                                             }
                                       }
                                 }
                           }
                     }
               }
         }
      }

      return (com.aspose.slides.internal.l7h.j5)var1;
   }

   private t2$n5 l6() {
      this.k5();
      if (this.n5.k5()) {
         return null;
      }

      if ('>' == this.n5.l6()) {
         return null;
      }

      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

      while (!this.n5.k5()) {
         switch (this.n5.l6()) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
               return this.n5(var1, var2);
            case '/':
            case '>':
               return null;
            case '=':
               this.n5.s7();
               return this.l6(var1, var2);
         }

         char var3 = this.n5.l6();
         if (var3 >= 'A' && var3 <= 'Z') {
            var1.n5(com.aspose.slides.ms.System.t9.z1(var3));
         } else {
            var1.n5(var3);
         }

         this.n5.s7();
      }

      return this.n5(var1, var2);
   }

   private t2$n5 n5(com.aspose.slides.internal.l7h.a5 var1, com.aspose.slides.internal.l7h.a5 var2) {
      this.k5();
      if (!this.n5.k5() && this.n5.l6() == '=') {
         this.n5.s7();
         return this.l6(var1, var2);
      } else {
         return new t2$n5(var1.toString(), com.aspose.slides.ms.System.d1.n5);
      }
   }

   private t2$n5 l6(com.aspose.slides.internal.l7h.a5 var1, com.aspose.slides.internal.l7h.a5 var2) {
      this.k5();
      if (this.n5.k5()) {
         return null;
      }

      switch (this.n5.l6()) {
         case '"':
         case '\'':
            char var3 = this.n5.l6();

            while (!this.n5.k5()) {
               this.n5.s7();
               if (this.n5.l6() == var3) {
                  return new t2$n5(var1.toString(), var2.toString());
               }

               char var4 = this.n5.l6();
               if (var4 >= 'A' && var4 <= 'Z') {
                  var2.n5(com.aspose.slides.ms.System.t9.z1(var4));
               } else {
                  var2.n5(var4);
               }
            }
            break;
         case '>':
            return new t2$n5(var1.toString(), com.aspose.slides.ms.System.d1.n5);
         default:
            if (this.n5.l6() >= 'A' && this.n5.l6() <= 'Z') {
               var2.n5(com.aspose.slides.ms.System.t9.z1(this.n5.l6()));
            } else {
               var2.n5(this.n5.l6());
            }

            this.n5.s7();
      }

      for (; !this.n5.k5(); this.n5.s7()) {
         switch (this.n5.l6()) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case '>':
               return new t2$n5(var1.toString(), var2.toString());
         }

         if (this.n5.l6() >= 'A' && this.n5.l6() <= 'Z') {
            var2.n5(com.aspose.slides.ms.System.t9.z1(this.n5.l6()));
         } else {
            var2.n5(this.n5.l6());
         }
      }

      return new t2$n5(var1.toString(), var2.toString());
   }

   private void k5() {
      while (!this.n5.k5() && ('\t' == this.n5.l6() || '\n' == this.n5.l6() || '\r' == this.n5.l6() || '\f' == this.n5.l6() || ' ' == this.n5.l6())) {
         this.n5.s7();
      }
   }

   private String n5(String var1) {
      com.aspose.slides.internal.p6.l6 var2 = this.l6.l6().k5();

      try {
         var2.n5(var1);
         j3 var3 = new j3(var2);

         try {
            var3.s7();

            do {
               String var4 = var3.n5("charset", false);
               if (null == var4) {
                  return null;
               }

               var3.n5(var3.n5() + 7);
               var3.n5('\t', '\n', '\r', '\f', ' ');
               if (var3.k5()) {
                  return null;
               }
            } while (var3.l6() != '=');

            var3.s7();
            var3.n5('\t', '\n', '\r', '\f', ' ');
            if (var3.k5()) {
               return null;
            }

            switch (var3.l6()) {
               case '"':
               case '\'':
                  String var5 = com.aspose.slides.ms.System.t9.q0(var3.l6());
                  var3.s7();
                  return var3.n5(var5, false);
               default:
                  return var3.l6(';', ' ');
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }
}
