package com.aspose.slides.internal.n8e;

import com.aspose.slides.exceptions.Exception;

public final class a0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("Choice", "Fallback", "p", "a");

   public static com.aspose.slides.internal.z0k.t4 n5(com.aspose.slides.internal.z0k.t4 var0) {
      com.aspose.slides.internal.z0k.m3 var1 = new com.aspose.slides.internal.z0k.m3(var0);
      com.aspose.slides.internal.l7h.j5 var2 = var1.l6();
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.j5 var4 = new com.aspose.slides.internal.z0k.j5(var3, var2);

      int var5;
      while ((var5 = var1.u9()) >= 0) {
         var4.n5((char)var5);
         if (var5 == 60) {
            var5 = var1.u9();
            var4.n5((char)var5);
            if (var5 == 33) {
               var5 = var1.u9();
               if (var5 < 0) {
                  break;
               }

               if (var5 == 91) {
                  int var19 = var1.u9();
                  if (var19 < 0) {
                     var4.n5((char)var5);
                     break;
                  }

                  if (var19 == 67) {
                     var4.n5((char)var5);
                     var4.n5((char)var19);
                     boolean var22 = true;

                     while ((var5 = var1.u9()) >= 0) {
                        var4.n5((char)var5);
                        if (var5 == 93) {
                           if (var22) {
                              break;
                           }

                           var22 = true;
                        } else {
                           var22 = false;
                        }
                     }
                  } else {
                     com.aspose.slides.internal.l7h.a5 var21 = new com.aspose.slides.internal.l7h.a5();
                     var21.n5((char)var5);
                     var21.n5((char)var19);
                     char var8 = ' ';

                     while (var8 != ']' && (var5 = var1.u9()) >= 0) {
                        var21.n5((char)var5);
                        var8 = (char)var5;
                     }

                     while ((var5 = var1.a6()) >= 0 && (var5 <= 32 || var5 == 45)) {
                        var1.u9();
                        var21.n5((char)var5);
                     }

                     var4.n5("-- ");
                     var4.n5(com.aspose.slides.ms.System.z3.n5(com.aspose.slides.internal.l7h.u6.z3().u3(var21.toString())));
                     var4.n5(" --");
                  }
               } else if (var5 == 45) {
                  com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5();
                  var6.n5((char)var5);
                  if ((var5 = var1.u9()) < 0) {
                     break;
                  }

                  var6.n5((char)var5);

                  while ((var5 = var1.u9()) >= 0) {
                     var6.n5((char)var5);
                     if (var5 > 32) {
                        break;
                     }
                  }

                  if (var5 == 91) {
                     char var20 = ' ';

                     while (var20 != ']' && var20 != '-' && (var5 = var1.u9()) >= 0) {
                        var6.n5((char)var5);
                        var20 = (char)var5;
                     }

                     while ((var5 = var1.a6()) >= 0 && (var5 <= 32 || var5 == 45)) {
                        var1.u9();
                        var6.n5((char)var5);
                     }

                     var4.n5("-- ");
                     var4.n5(com.aspose.slides.ms.System.z3.n5(com.aspose.slides.internal.l7h.u6.z3().u3(var6.toString())));
                     var4.n5(" --");
                  } else {
                     int var7 = 0;

                     while ((var5 = var1.u9()) >= 0 && (var5 != 62 || var7 < 2)) {
                        var6.n5((char)var5);
                        if (var5 == 45) {
                           var7++;
                        } else {
                           var7 = 0;
                        }
                     }

                     var4.n5("-- ");
                     var4.n5(com.aspose.slides.ms.System.z3.n5(com.aspose.slides.internal.l7h.u6.z3().u3(var6.toString())));
                     var4.n5(" --");
                     if (var5 >= 0) {
                        var4.n5((char)var5);
                     }
                  }
               }
            }
         }
      }

      var4.k5();
      var3.seek(0L, 0);
      return var3;
   }

   public static j4 n5(com.aspose.slides.internal.z0k.t4 var0, boolean var1) {
      return n5(var0, var1, true);
   }

   static j4 n5(com.aspose.slides.internal.z0k.t4 var0, boolean var1, boolean var2) {
      g7 var3 = new g7(var0);
      j4 var4 = new j4();
      y4 var5 = new y4();
      u3 var6 = new u3();
      com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5();

      label623:
      while (true) {
         int var8 = var3.u9();
         if (var8 < 0) {
            return var4;
         }

         if (var8 == 60) {
            int var9 = var3.n5() - 1;
            int var10 = 0;
            var7.l6(0, var7.l6());
            char var11 = (char)var3.u9();
            char var12 = ' ';
            int var13 = 0;
            String var15;
            switch (var11) {
               case '!':
                  var11 = (char)var3.u9();
                  if (var11 == '[') {
                     do {
                        var13 = var3.u9();
                     } while (var13 != 91 && var13 > 0);

                     while (true) {
                        if (var11 == ']' || var12 == ']') {
                           continue label623;
                        }

                        var12 = var11;
                        var13 = var3.u9();
                        if (var13 < 0) {
                           throw new Exception("EOF in comment.");
                        }

                        var11 = (char)var13;
                     }
                  }

                  if (var11 != '!') {
                     continue;
                  }

                  if (var3.u9() != 45) {
                     throw new Exception("Error in comment.");
                  }

                  while (var11 != '-' && var12 != '-') {
                     var12 = var11;
                     var13 = var3.u9();
                     if (var13 < 0) {
                        throw new Exception("EOF in comment.");
                     }

                     var11 = (char)var13;
                  }

                  if (var3.u9() != 62) {
                     throw new Exception("Error in comment.");
                  }
                  continue;
               case '/':
                  n3 var41 = var5.k5();
                  if (var41.a6 != null) {
                     for (int var42 = 0; var42 < var41.a6.length(); var42++) {
                        if (var3.u9() != var41.a6.charAt(var42)) {
                           throw new Exception(com.aspose.slides.ms.System.d1.n5("Non matching element close tag: expected </{0}:{1}>",new Object[]{ var41.a6, var41.u9}));
                        }
                     }

                     if (var3.u9() != 58) {
                        throw new Exception(com.aspose.slides.ms.System.d1.n5("Non matching element close tag: expected </{0}:{1}>",new Object[]{ var41.a6, var41.u9}));
                     }
                  }

                  for (int var43 = 0; var43 < var41.u9.length(); var43++) {
                     if (var3.u9() != var41.u9.charAt(var43)) {
                        throw new Exception(com.aspose.slides.ms.System.d1.n5("Non matching element close tag: expected </{0}>", new Object[]{var41.u9}));
                     }
                  }

                  var11 = (char)var3.u9();

                  while (var11 <= ' ') {
                     var11 = (char)var3.u9();
                  }

                  if (var11 != '>') {
                     throw new Exception(com.aspose.slides.ms.System.d1.n5("Non matching element close tag: expected </{0}>", new Object[]{var41.u9}));
                  }

                  var10 = var3.n5();
                  if (var41.a6 != null
                     && "http://schemas.openxmlformats.org/markup-compatibility/2006".equals(var5.n5(var41.a6))
                     && ("Choice".equals(var41.u9) || "Fallback".equals(var41.u9))
                     && var41.u3 == 0
                     && !var41.k5) {
                     var4.n5(var41.h0, var10 - var41.h0);
                  }

                  if (var41.n5) {
                     if (!var5.n5(var41.a6, var41.u9)) {
                        var4.n5(var41.h0, var10 - var41.h0);
                     } else {
                        var4.n5(var41.h0, var41.c8 - var41.h0);
                        var4.n5(var9, var10 - var9);
                     }
                  }

                  var5.l6();
                  continue;
               case '?':
                  while (var11 != '>' || var12 != '?') {
                     var12 = var11;
                     var13 = var3.u9();
                     if (var13 < 0) {
                        throw new Exception("EOF in processing directive.");
                     }

                     var11 = (char)var13;
                  }
                  continue;
               default:
                  var7.l6(0, var7.l6());
                  var15 = null;
            }

            while (var11 > ' ' && var11 != '/' && var11 != '>' && var11 != ':') {
               var7.n5(var11);
               var13 = var3.u9();
               if (var13 < 0) {
                  throw new Exception("Error in element name.");
               }

               var11 = (char)var13;
            }

            String var16 = var7.toString();
            boolean var17 = false;
            if (var11 == ':') {
               var7.l6(0, var7.l6());
               var11 = (char)var3.u9();
               var15 = var16;

               while (var11 > ' ' && var11 != '/' && var11 != '>') {
                  var7.n5(var11);
                  var13 = var3.u9();
                  if (var13 < 0) {
                     throw new Exception("Error in element name.");
                  }

                  var11 = (char)var13;
               }

               var16 = var7.toString();
            }

            if (var1 && var5.n5() == 0) {
               var4.n5(f0.k5, var3.n5() - 1);
            }

            while (var11 <= ' ') {
               var11 = (char)var3.u9();
            }

            n3 var14 = new n3(var15, var16);
            var6.l6();

            while (var11 != '/' && var11 != '>') {
               var7.l6(0, var7.l6());
               String var18 = null;
               int var19 = var3.n5() - 1;

               while (var11 > ' ' && var11 != '=' && var11 != ':') {
                  var7.n5(var11);
                  var13 = var3.u9();
                  if (var13 < 0) {
                     throw new Exception("Error in attribute name.");
                  }

                  var11 = (char)var13;
               }

               String var20 = var7.toString();
               if (var11 == ':') {
                  var7.l6(0, var7.l6());
                  var11 = (char)var3.u9();
                  var18 = var20;

                  while (var11 > ' ' && var11 != '=') {
                     var7.n5(var11);
                     var13 = var3.u9();
                     if (var13 < 0) {
                        throw new Exception("Error in attribute name.");
                     }

                     var11 = (char)var13;
                  }

                  var20 = var7.toString();
               }

               while (var11 <= ' ') {
                  var11 = (char)var3.u9();
               }

               if (var11 != '=') {
                  throw new Exception("Error in attribute syntax.");
               }

               var11 = (char)var3.u9();

               while (var11 <= ' ') {
                  var11 = (char)var3.u9();
               }

               if (var11 != '\'' && var11 != '"') {
                  throw new Exception("Error in attribute syntax.");
               }

               int var21 = var3.n5();
               var7.l6(0, var7.l6());

               for (var13 = var3.u9(); var13 >= 0 && var13 != var11; var13 = var3.u9()) {
                  if (var13 > 31) {
                     var7.n5((char)var13);
                  } else {
                     var4.n5(var3.n5() - 1, 1);
                  }
               }

               if (var13 != var11) {
                  throw new Exception("Unexpected EOF in attribute value.");
               }

               int var22 = var3.n5() - 1;
               String var23 = var7.toString();
               var11 = (char)var3.u9();

               while (var11 <= ' ') {
                  var11 = (char)var3.u9();
               }

               int var24 = var3.n5() - 1;
               if ("xmlns".equals(var18)) {
                  if ("http://schemas.microsoft.com/office/powerpoint/2007/7/12/main".equals(var23)) {
                     var4.n5(var21, var22 - var21);
                     var4.n5(f0.l6, var21);
                  }

                  var14.n5(var20, var23);
               } else {
                  var6.n5(var18, var20, var23, var19, var24, var4, var2);
               }
            }

            if (var11 == '/') {
               if (var3.u9() != 62) {
                  throw new Exception("Error in element.");
               }

               var17 = true;
            }

            var10 = var3.n5();
            var14.h0 = var9;
            var14.c8 = var10;
            var5.n5(var14);
            if (var14.a6 != null) {
               if ("http://schemas.openxmlformats.org/markup-compatibility/2006".equals(var5.n5(var14.a6))) {
                  switch (n5.n5(var14.u9)) {
                     case 0:
                        n3 var45 = var5.n5(1);
                        if (!"AlternateContent".equals(var45.u9)) {
                           throw new Exception("Choice element found not within AlternativeContent");
                        }

                        if (var45.u3 != 0) {
                           var14.u3 = 0;
                        } else {
                           for (int var48 = 0; var48 < var6.n5(); var48++) {
                              k5 var53 = var6.n5(var48);
                              if (var53.n5 == null && "Requires".equals(var53.l6)) {
                                 var14.u3 = 1;
                                 int var58 = 0;
                                 String var62 = null;

                                 while (var58 < var53.k5.length()) {
                                    while (var58 < var53.k5.length() && var53.k5.charAt(var58) <= ' ') {
                                       var58++;
                                    }

                                    int var65 = var58;

                                    while (var58 < var53.k5.length() && var53.k5.charAt(var58) > ' ') {
                                       var58++;
                                    }

                                    if (var58 > var65) {
                                       var62 = com.aspose.slides.ms.System.d1.l6(var53.k5, var65, var58 - var65);
                                       if (!var5.u3(var62)) {
                                          var14.u3 = 0;
                                          break;
                                       }
                                    }
                                 }

                                 if (var14.u3 != 0) {
                                    var45.u3 = 1;
                                    int var66 = 0;
                                    int[] var71 = new int[]{0};
                                    boolean var25 = var45.n5(var62, var71);
                                    var66 = var71[0];
                                    if (var25) {
                                       var14.u3 = Integer.MAX_VALUE - var66;
                                    } else {
                                       var71[0] = var66;
                                       boolean var26 = var14.n5(var62, var71);
                                       var66 = var71[0];
                                       if (var26) {
                                          var45.u3 = Integer.MAX_VALUE;
                                          var14.u3 = Integer.MAX_VALUE - var66;
                                       } else {
                                          var14.u3 = 0;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                        break;
                     case 1:
                        n3 var44 = var5.n5(1);
                        if (!"AlternateContent".equals(var44.u9)) {
                           throw new Exception("Fallback element found not within AlternativeContent");
                        }

                        if (var44.u3 != 0 && !var44.k5) {
                           var14.u3 = 0;
                        } else {
                           var14.u3 = 1;
                           var44.u3 = 1;
                        }
                  }
               } else if (var5.n5() > 2) {
                  n3 var46 = var5.n5(2);
                  if ("AlternateContent".equals(var46.u9)) {
                     n3 var49 = var5.n5(1);
                     if ("Choice".equals(var49.u9) && var46.u3 != 0 && var49.u3 != 0) {
                        String var54 = var46.u3 == Integer.MAX_VALUE ? var49.n5(Integer.MAX_VALUE - var49.u3) : var46.n5(Integer.MAX_VALUE - var49.u3);

                        for (int var59 = 0; var59 < f0.n5.n5(); var59++) {
                           if (com.aspose.slides.ms.System.d1.a6(var54, f0.n5.n5(var59).l6())
                              && f0.n5.n5(var59).k5() != m3.n5()
                              && !f0.n5.n5(var59).k5().containsItem(var14.u9)) {
                              var46.u3 = 0;
                              var49.u3 = 0;
                           }
                        }
                     }
                  }
               }
            }

            boolean var47 = false;
            switch (n5.n5(var14.a6)) {
               case 2:
                  var47 = "sp".equals(var14.u9) || "graphicFrame".equals(var14.u9) || "contentPart".equals(var14.u9);
                  break;
               case 3:
                  var47 = "tbl".equals(var14.u9);
            }

            if (var47) {
               int var50 = n5(var5);
               if (var50 < var5.n5()) {
                  n3 var55 = var5.n5(var50);
                  if (var55.n5 && var55.l6 != null) {
                     n5(var4, var55);
                  }

                  n3 var60 = var5.n5(var50 - 1);
                  if ("Choice".equals(var60.u9) && var60.n5 && var60.l6 != null) {
                     n5(var4, var60);
                  }
               }
            }

            if (var15 != null && var5.l6(var15)) {
               boolean var51 = false;
               if (var5.n5() > 2) {
                  n3 var56 = var5.n5(1);
                  if ("AlternateContent".equals(var56.u9) && var56.k5) {
                     var51 = true;
                  }
               }

               if (!var51) {
                  var14.n5 = true;
                  var14.l6 = new v8(var14.h0, new v3(var14.h0, var14.c8, null));
                  var4.n5(var14.h0, var14.c8 - var14.h0);
               }
            }

            for (int var52 = 0; var52 < var6.n5(); var52++) {
               k5 var57 = var6.n5(var52);
               if (var57.n5 != null) {
                  String var61 = var5.n5(var57.n5);
                  if ("http://schemas.openxmlformats.org/markup-compatibility/2006".equals(var61) || var5.k5(var61)) {
                     var4.n5(var57.u3, var57.a6 - var57.u3);
                  }

                  if ("http://schemas.openxmlformats.org/markup-compatibility/2006".equals(var61)) {
                     if ("Ignorable".equals(var57.l6)) {
                        int var64 = 0;

                        while (var64 < var57.k5.length()) {
                           while (var64 < var57.k5.length() && var57.k5.charAt(var64) <= ' ') {
                              var64++;
                           }

                           int var70 = var64;

                           while (var64 < var57.k5.length() && var57.k5.charAt(var64) > ' ') {
                              var64++;
                           }

                           if (var64 > var70) {
                              var14.n5(var5.n5(com.aspose.slides.ms.System.d1.l6(var57.k5, var70, var64 - var70)));
                           }
                        }
                     } else if ("ProcessContent".equals(var57.l6)) {
                        int var63 = 0;

                        while (var63 < var57.k5.length()) {
                           while (var63 < var57.k5.length() && var57.k5.charAt(var63) <= ' ') {
                              var63++;
                           }

                           int var69 = var63;

                           while (var63 < var57.k5.length() && var57.k5.charAt(var63) > ' ' && var57.k5.charAt(var63) != ':') {
                              var63++;
                           }

                           int var72 = var63++;

                           while (var63 < var57.k5.length() && var57.k5.charAt(var63) > ' ') {
                              var63++;
                           }

                           if (var63 > var72 + 1 && var72 > var69) {
                              String var73 = com.aspose.slides.ms.System.d1.l6(var57.k5, var72 + 1, var63 - var72 - 1);
                              var14.l6(var5.n5(com.aspose.slides.ms.System.d1.l6(var57.k5, var69, var72 - var69)), "*".equals(var73) ? null : var73);
                           }
                        }
                     }
                  }
               }
            }

            if (var17) {
               var5.l6();
            }
         }
      }
   }

   private static void n5(j4 var0, n3 var1) {
      var1.n5 = false;
      var1.k5 = true;
      int var2 = var1.l6.n5;
      int var3 = var1.l6.l6.l6;
      var0.n5(null, var2, var3, var2);
   }

   private static int n5(y4 var0) {
      int var1;
      for (var1 = 2; var1 < var0.n5(); var1++) {
         if ("AlternateContent".equals(var0.n5(var1).u9)) {
            return var1;
         }
      }

      return var1;
   }
}
