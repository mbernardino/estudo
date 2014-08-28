package com.simple.programmer.proteintracker.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory(GoodTestCategory.class)
@ExcludeCategory(BadTestCategory.class)
@Suite.SuiteClasses({
	HelloJUnitTest.class,
	ProgramTest.class
})
public class GoodTestsSuite {
//	implementar a interface e setar as classes que fazem parte teste conjunto de categorias
}
