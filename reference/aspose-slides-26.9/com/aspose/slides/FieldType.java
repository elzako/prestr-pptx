package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

public final class FieldType implements IFieldType {
   private String n5;
   private static final FieldType l6 = new FieldType("slidenum");
   private static final FieldType k5 = new FieldType("footer");
   private static final FieldType u3 = new FieldType("header");
   private static final FieldType a6 = new FieldType("datetime");
   private static final FieldType u9 = new FieldType("datetime1");
   private static final FieldType h0 = new FieldType("datetime2");
   private static final FieldType c8 = new FieldType("datetime3");
   private static final FieldType t2 = new FieldType("datetime4");
   private static final FieldType s7 = new FieldType("datetime5");
   private static final FieldType x8 = new FieldType("datetime6");
   private static final FieldType n3 = new FieldType("datetime7");
   private static final FieldType y4 = new FieldType("datetime8");
   private static final FieldType e2 = new FieldType("datetime9");
   private static final FieldType t9 = new FieldType("datetime10");
   private static final FieldType z1 = new FieldType("datetime11");
   private static final FieldType t4 = new FieldType("datetime12");
   private static final FieldType q0 = new FieldType("datetime13");
   private static final FieldType z3 = new FieldType("datetime14");
   private static final List<FieldType> m1 = new List<>();

   public FieldType(String str) {
      this.n5 = str;
   }

   @Override
   public final String getInternalString() {
      return this.n5;
   }

   @Override
   public final void setInternalString(String value) {
      this.n5 = value;
   }

   @Override
   public boolean equals(Object obj) {
      return obj != null && com.aspose.slides.internal.v6g.k5.l6(obj, FieldType.class)
         ? com.aspose.slides.ms.System.d1.a6(this.n5, ((FieldType)obj).n5)
         : false;
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   public static boolean op_Equality(FieldType a, FieldType b) {
      return com.aspose.slides.ms.System.j8.l6(a, null) ? com.aspose.slides.ms.System.j8.l6(b, null) : a.equals(b);
   }

   public static boolean op_Inequality(FieldType a, FieldType b) {
      return com.aspose.slides.ms.System.j8.l6(a, null) ? !com.aspose.slides.ms.System.j8.l6(b, null) : !a.equals(b);
   }

   public static FieldType getSlideNumber() {
      return l6;
   }

   public static FieldType getFooter() {
      return k5;
   }

   public static FieldType getHeader() {
      return u3;
   }

   public static FieldType getDateTime() {
      return a6;
   }

   public static FieldType getDateTime1() {
      return u9;
   }

   public static FieldType getDateTime2() {
      return h0;
   }

   public static FieldType getDateTime3() {
      return c8;
   }

   public static FieldType getDateTime4() {
      return t2;
   }

   public static FieldType getDateTime5() {
      return s7;
   }

   public static FieldType getDateTime6() {
      return x8;
   }

   public static FieldType getDateTime7() {
      return n3;
   }

   public static FieldType getDateTime8() {
      return y4;
   }

   public static FieldType getDateTime9() {
      return e2;
   }

   public static FieldType getDateTime10() {
      return t9;
   }

   public static FieldType getDateTime11() {
      return z1;
   }

   public static FieldType getDateTime12() {
      return t4;
   }

   public static FieldType getDateTime13() {
      return q0;
   }

   static FieldType n5() {
      return z3;
   }

   static List<FieldType> l6() {
      return m1;
   }

   static {
      m1.addItem(a6);
      m1.addItem(u9);
      m1.addItem(h0);
      m1.addItem(c8);
      m1.addItem(t2);
      m1.addItem(s7);
      m1.addItem(x8);
      m1.addItem(n3);
      m1.addItem(y4);
      m1.addItem(e2);
      m1.addItem(t9);
      m1.addItem(z1);
      m1.addItem(t4);
      m1.addItem(q0);
      m1.addItem(z3);
   }
}
