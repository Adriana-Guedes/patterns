package designerpattern.build;

public interface IBuilder {

   void buildName();
   void buildDB();
   void buildWebpack();
   void buildTestes();
   void  buildFull();
}
